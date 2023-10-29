package com.example.opmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);   // Gán menu cho hoạt động
        Toolbar toolbar = findViewById(R.id.toolbar); // Điều này là tùy chọn, bạn có thể sử dụng thanh ActionBar thay cho thanh Toolbar
        setSupportActionBar(toolbar);

    }
    public void goobye(View view){
        int Id = view.getId();
if(Id == R.id.btnComment){
        DialogFragment commentDialog = new DialogFragment() ;
    commentDialog.show(getSupportFragmentManager(), "commentDialog");
}else if(Id == R.id.btnGoddbye){
        Toast.makeText(this,"Good Bye!",Toast.LENGTH_SHORT).show();
}else if(Id == R.id.btnDone){
    DialogFragment demoDialog = new DialogFragment() ;
    demoDialog.show(getSupportFragmentManager(), "demoDialog");
}else{

}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.mExit){
            finishAffinity();
            return true;
        }
        return false;
    }
}