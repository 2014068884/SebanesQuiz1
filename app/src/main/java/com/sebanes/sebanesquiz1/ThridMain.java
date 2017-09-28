package com.sebanes.sebanesquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThridMain extends AppCompatActivity {
    TextView name, version, api, date;
    Button home, one, three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        name = (TextView) findViewById(R.id.name);
        api = (TextView) findViewById(R.id.api);
        version = (TextView) findViewById(R.id.version);
        date = (TextView) findViewById(R.id.date);

        home = (Button) findViewById(R.id.home);
        one = (Button) findViewById(R.id.one);
        three = (Button) findViewById(R.id.three);

        String outName = getIntent().getStringExtra("two");
    }

    public void goToHome(View view) {
        Intent intent1 = new Intent(this, SecondMain.class);
        intent1.putExtra("home", home.getText());
        startActivity(intent1);
    }

    public void goToOne(View view) {
        Intent intent2 = new Intent(this, ThridMain.class);
        intent2.putExtra("two", one.getText());
        startActivity(intent2);
    }

    public void goToThree(View view) {
        Intent intent3 = new Intent(this, FourthActivity.class);
        intent3.putExtra("three", three.getText());
        startActivity(intent3);
    }
}
