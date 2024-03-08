package br.com.estudo.testes_de_layout;

import static br.com.estudo.testes_de_layout.MainActivity.KEY_AGE;
import static br.com.estudo.testes_de_layout.MainActivity.KEY_NAME;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Obtendo o pacote do bundle com as mesmas informações que enviei na primeira activity
        Bundle extras = getIntent().getExtras();
        assert extras != null;

        final String name = extras.getString(KEY_NAME, "Valor Default");
        final int age = extras.getInt(KEY_AGE, -1);

        MainActivity mainActivity = new MainActivity();
        mainActivity.toastMessage(this, name + " " + age);
    }
}