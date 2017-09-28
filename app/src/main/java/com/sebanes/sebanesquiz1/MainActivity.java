package com.sebanes.sebanesquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button one, two, three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
    }

    public void goToOne(View view) {
        Intent intent1 = new Intent(this, SecondMain.class);
        intent1.putExtra("one", one.getText());
        startActivity(intent1);
    }

    public void goToTwo(View view) {
        Intent intent2 = new Intent(this, ThridMain.class);
        intent2.putExtra("two", two.getText());
        startActivity(intent2);
    }

    public void goToThree(View view) {
        Intent intent3 = new Intent(this, FourthActivity.class);
        intent3.putExtra("three", three.getText());
        startActivity(intent3);
    }
}
