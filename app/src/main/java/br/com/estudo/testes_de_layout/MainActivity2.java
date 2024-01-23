package br.com.estudo.testes_de_layout;

import static br.com.estudo.testes_de_layout.MainActivity.KEY_INFORMACAO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView txtMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMain = findViewById(R.id.txt_main);

        final String stringExtra = getIntent().getStringExtra(KEY_INFORMACAO);

        Bundle extras = getIntent().getExtras();
        final String stringBundleExtra = extras.getString(KEY_INFORMACAO, "Valor Default");

//        assert stringExtra != null;

        final String s = assertNotNull(stringExtra);

        if (stringExtra != null)
            txtMain.setText(stringExtra);

        if (stringBundleExtra != null)
            txtMain.setText(stringExtra);
    }

    public static String assertNotNull(String object) {
        if (object == null)
            throw new AssertionError("Objeto não pode ser nulo!");
        return object = "";
    }
}