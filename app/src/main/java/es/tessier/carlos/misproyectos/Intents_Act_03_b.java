package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Intents_Act_03_b extends Activity {

    String str1 = "";
    int int1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_03_b);

        Bundle bundle = getIntent().getExtras();

        if (bundle.getString(str1) != null) {
            str1 = bundle.getString("str1");
            Toast.makeText(getApplicationContext(), str1, Toast.LENGTH_LONG).show();
        }

        if (bundle.getInt(String.valueOf(int1)) != 0) {
            int1 = bundle.getInt("int1");
            Toast.makeText(getApplicationContext(), int1, Toast.LENGTH_LONG).show();
        }
    }

    public void Volver(View view) {
        Intent intent = new Intent();
        intent.putExtra("str2", "Esto es otro String");
        intent.putExtra("num2", 25);
        setResult(RESULT_OK, intent);
        finish();
    }
}
