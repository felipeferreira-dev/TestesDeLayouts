package br.com.estudo.testes_de_layout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AbstractActivity {
    private Button btn;
    private Intent intent;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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

    @Override
    public void initViews() {
        bundle = new Bundle();
        btn = findViewById(R.id.btn_tela2);
    }

    @Override
    public int getLayout() {
        return R.layout.linear_layout;
    }
}