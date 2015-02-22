package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Intents_Act_01 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_01);
    }

    public void segundaAct01(View view) {
        startActivity(new Intent(this, Intents_Act_01_b.class));
    }

}
