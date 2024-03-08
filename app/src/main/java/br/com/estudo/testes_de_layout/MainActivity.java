package br.com.estudo.testes_de_layout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    private Intent intent;
    private Bundle bundle;

    public static final String KEY_NAME = "key_name";
    public static final String KEY_AGE = "key_age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        initVar();

        // TODO: 19/01/2024 Testando layouts
        btn.setOnClickListener(view -> {
            String name = "Felipe Bemvindo";
            int age = 26;

            // Se for utilizar as informações em mais de uma activity, compensa mais usar o Bundle!
            intent = new Intent(MainActivity.this, MainActivity2.class);
            bundle.putString(KEY_NAME, name);
            bundle.putInt(KEY_AGE, age);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }

    private void initVar() {
        bundle = new Bundle();
        btn = findViewById(R.id.btn_tela2);
    }

    void toastMessage(Context context, String s) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
    }
}