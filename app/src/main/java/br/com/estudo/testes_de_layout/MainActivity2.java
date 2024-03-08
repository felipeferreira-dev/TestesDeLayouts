package br.com.estudo.testes_de_layout;

import static br.com.estudo.testes_de_layout.MainActivity.KEY_AGE;
import static br.com.estudo.testes_de_layout.MainActivity.KEY_NAME;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity2 extends AbstractActivity {

    private TextView txtMain;
    Bundle bundleExtras;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        toastMessage(this, "Entrei na tela 2!!", Toast.LENGTH_SHORT);

/*        final String stringExtra = getIntent().getStringExtra(KEY_INFORMACAO);
        if (stringExtra != null)
            txtMain.setText(stringExtra);*/

        // Obtendo os dados do bundle
        bundleExtras = getIntent().getExtras();
        assert bundleExtras != null;

        final String name = bundleExtras.getString(KEY_NAME, "Valor Default");
        final int age = bundleExtras.getInt(KEY_AGE, -1);

        if (name != null)
            txtMain.setText(String.format(Locale.getDefault(), "%s %d", name, age));

        // Repassando as informações para a proxima tela, sem precisar declarar cada uma novamente
        intent.putExtras(bundleExtras);
        startActivity(intent);
    }

    @Override
    public void initViews() {
        intent = new Intent(this, MainActivity3.class);
        txtMain = findViewById(R.id.txt_main);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }
}