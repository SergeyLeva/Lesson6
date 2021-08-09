package ua.sergeylevcenko.less6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }


    public void onClick(View view) {
        Intent intent3 = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(intent3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0, 0, 0, "первая");
        menu.add(1, 1, 1, "вторая");
        menu.add(2, 2, 2, "третья ");

        return super.onCreateOptionsMenu(menu);
    }
}