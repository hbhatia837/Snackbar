package com.example.snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    CoordinatorLayout frameLayout;
    FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        frameLayout = findViewById(R.id.mylayout);
        floatingActionButton=findViewById(R.id.floating);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(frameLayout,"Simple snack bar example",Snackbar.LENGTH_LONG).show();            }
        });
        toolbar.setTitle("Basic Component");
        toolbar.inflateMenu(R.menu.menu_main);
toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
    @Override
    public boolean onMenuItemClick(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.simple:
              showSimpleSnackbar();
            break;
            case R.id.style:
                Toast.makeText(MainActivity.this, "simple", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action:
              showActionSnackbar();
                break;


        }
        return true;

    }
});

    }

    private void showSimpleSnackbar() {


        Snackbar.make(frameLayout,"Simple snack bar example",Snackbar.LENGTH_LONG).show();

    }


    private void showActionSnackbar() {
       Snackbar snackbar= Snackbar.make(frameLayout,"File deleted Succesfully",Snackbar.LENGTH_LONG);
       snackbar.setAction("Undo", new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                Snackbar.make(frameLayout,"File recovered succesfully",Snackbar.LENGTH_LONG).show();
           }
       });

snackbar.show();


    }

    private void showStyleSnackbar() {
    }



}
