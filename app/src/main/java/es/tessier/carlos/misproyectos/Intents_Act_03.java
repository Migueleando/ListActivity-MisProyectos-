package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Intents_Act_03 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_03);
    }
    public void Pulsame(View view) {

        Intent intent = new Intent(this, Intents_Act_03_b.class);
        intent.putExtra("str1", "Vuelvo");
        intent.putExtra("num1", 0);
        startActivity(intent);
    }
}
