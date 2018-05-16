package wbollock.com.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Bundle applesData = getIntent().getExtras(); // getting any extra information whenever Bacon is launched
        if(applesData == null)
            return; // if applesData returns nothing, take care of it. but if applesData actually puts through information....

        String appleMessage = applesData.getString("appleMessage");
        final TextView baconText = (TextView) findViewById(R.id.baconText);
        baconText.setText(appleMessage); // appleMessage is string the user types in

    }

    public void onClick(View view){
        Intent i = new Intent(this, Apples.class); // bacon is activity we want to launch "onClick"
        startActivity(i);
    }

}
