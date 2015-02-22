package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Intents_Act_02_b extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_02_b);
    }

    public void onClickAct02(View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        String textEdit = editText.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("textEdit", textEdit);
        setResult(RESULT_OK, intent);

        finish();
    }

}
