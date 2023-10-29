package com.example.pop_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMenu=(Button) findViewById(R.id.btMenu);
        btMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu();
            }
        });
    }

    private void ShowMenu(){
        PopupMenu popupMenu=new PopupMenu(this,btMenu);
        popupMenu.getMenuInflater().inflate(R.menu.menu_popup,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                if(id == R.id.mThem){
                    btMenu.setText("Menu them");
                }else if(id == R.id.mSua){
                    btMenu.setText("Menu Sua");
                }else if(id == R.id.mXoa){
                    btMenu.setText("Menu Xoa");
                }else{
                    return false;
                }
                return true;
            }
        });
        popupMenu.show();
    }
}