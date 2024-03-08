package br.com.estudo.testes_de_layout;

import static br.com.estudo.testes_de_layout.MainActivity.KEY_AGE;
import static br.com.estudo.testes_de_layout.MainActivity.KEY_NAME;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {

    private TextView txtMain;

    MainActivity main;
    Bundle bundleExtras;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        main.toastMessage(this, "Entrei na tela 2!!");

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

    private void initViews() {
        main = new MainActivity();
        intent = new Intent(this, MainActivity3.class);
        txtMain = findViewById(R.id.txt_main);
    }
}