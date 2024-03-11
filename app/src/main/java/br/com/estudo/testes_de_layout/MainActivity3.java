package br.com.estudo.testes_de_layout;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity3 extends AbstractActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Obtendo o pacote do bundle com as mesmas informações que enviei na primeira activity
        Bundle extras = getIntent().getExtras();
        assert extras != null;

        String name = extras.getString(KEY_NAME, "Valor Default");
        int age = extras.getInt(KEY_AGE, -1);

        toastMessage(this, name + " " + age, Toast.LENGTH_SHORT);
    }

    @Override
    public void initViews() {

    }

    @Override
    public int getLayout() {
        return R.layout.activity_main3;
    }
}