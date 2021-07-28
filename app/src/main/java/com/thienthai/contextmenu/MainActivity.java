package com.thienthai.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button btnColor;
    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            btnColor = (Button) findViewById(R.id.btnColor);
            constraintLayout = (ConstraintLayout) findViewById(R.id.layout);

            //đăng kí view cho context menu
            registerForContextMenu(btnColor);
    }

    @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            getMenuInflater().inflate(R.menu.menu, menu);
            menu.setHeaderTitle("Chọn màu");
            menu.setHeaderIcon(R.drawable.nv1);

            super.onCreateContextMenu(menu, v, menuInfo);
        }

        @Override
        public boolean onContextItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.tim: constraintLayout.setBackgroundColor(Color.parseColor("#000000"));
                    break;
                case R.id.vang: constraintLayout.setBackgroundColor(Color.rgb(255,235,59));
                    break;
                case R.id.xanh: constraintLayout.setBackgroundColor(Color.rgb(33,150,243));
                    break;
                case R.id.đo: constraintLayout.setBackgroundColor(Color.rgb(221,53,23));
                    break;

                case R.id.đen: constraintLayout.setBackgroundColor(Color.rgb(0,0,0));
                    break;
            }
            return super.onContextItemSelected(item);
        }
}