package br.com.estudo.testes_de_layout;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    public static String KEY_INFORMACAO = "info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        btn = findViewById(R.id.btn_tela2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String enviaTexto = null;
                intent.putExtra(KEY_INFORMACAO, enviaTexto);
                startActivity(intent);
            }
        });

        funTest("10 mandamentos");
    }

    private void funTest(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}