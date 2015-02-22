package es.tessier.carlos.misproyectos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ImplicitIntents extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intents);
    }
    public void onClickWebBrowser (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uem.es/"));
        startActivity(intent);
    }

    public void onClickCall(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+902232350"));
        startActivity(intent);
    }

    public void onClickShowMap(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:%f, %f 40.37367,-3.919848"));
        startActivity(intent);
    }
}
