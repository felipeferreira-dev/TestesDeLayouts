package br.com.estudo.testes_de_layout;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

// Definindo uma classe abstrata para reaproveitar comportamentos genericos
public abstract class AbstractActivity extends AppCompatActivity {

    public static final String KEY_NAME = "key_name";
    public static final String KEY_AGE = "key_age";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logDebug(getLocalClassName(), "ON CREATE!!!");
        setContentView(getLayout());
        initViews();

    }
    public static void toastMessage(Context context, String message, int duration) {
        Toast.makeText(context, message, duration).show();
    }

    public static void logDebug(String className, String message) {
        Log.d("@@DEBUG_" + className.toUpperCase() + "@@", message);
    }

    @Override
    protected void onPause() {
        super.onPause();
        logDebug(getLocalClassName(), "ON PAUSE!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logDebug(getLocalClassName(), "ON RESUME!!!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logDebug(getLocalClassName(), "ON RESTART!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logDebug(getLocalClassName(), "ON STOP!!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logDebug(getLocalClassName(), "ON START!!!");
    }

    public abstract void initViews();

    public abstract int getLayout();
}
