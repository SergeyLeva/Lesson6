package ua.sergeylevcenko.less6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == 0) {
            Intent intentOne = new Intent(MainActivity3.this, MainActivity.class);
            startActivity(intentOne);
        }
        if (item.getItemId() == 1) {
            Intent intentSecond = new Intent(MainActivity3.this, MainActivity2.class);
            startActivity(intentSecond);
        }
        if (item.getItemId() == 2) {
            Intent intentThree = new Intent(MainActivity3.this, MainActivity3.class);
            startActivity(intentThree);
        }

        return super.onOptionsItemSelected(item);
    }



}
