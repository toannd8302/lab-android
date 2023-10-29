package com.example.context_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btMau;
    ConstraintLayout manHinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMau=(Button) findViewById(R.id.btMau);
        manHinh=(ConstraintLayout) findViewById(R.id.manHinh);
        //dang ki view cho conetext menu
        //context menu la phai long click
        registerForContextMenu(btMau);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context,menu);
        menu.setHeaderTitle("Chọn Màu");
        menu.setHeaderIcon(R.mipmap.ic_launcher);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.mXanh){
            manHinh.setBackgroundColor(Color.CYAN);
        }else if(id == R.id.mXam){
            manHinh.setBackgroundColor(Color.LTGRAY);
        }else if(id == R.id.mTim){
            manHinh.setBackgroundColor(Color.MAGENTA);
        }else{
            return false;
        }
        return true;
    }
}