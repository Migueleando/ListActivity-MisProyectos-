package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Intents_Act_02 extends Activity {

    static final int IDENTIFICADOR = 1;
    private static final String TAG = Intents_Act_02_b.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_02);
    }

    public void segundaAct02(View view) {
        startActivityForResult(new Intent(this, Intents_Act_02_b.class), IDENTIFICADOR);
    }

    protected void onActivityResult(int recuestCode, int resultCode, Intent dato) {
        super.onActivityResult(recuestCode,resultCode,dato);
        if (recuestCode == IDENTIFICADOR & resultCode == RESULT_OK) {
            Toast.makeText(this, dato.getStringExtra("textEdit"), Toast.LENGTH_LONG).show();
        }
    }
}
