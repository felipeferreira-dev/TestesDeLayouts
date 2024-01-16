package br.com.estudo.testes_de_layout;


import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        funTest("10 mandamentos");
    }

    private void funTest(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}