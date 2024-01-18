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
        txtMain.setText(getIntent().getStringExtra(KEY_INFORMACAO));


    }
}