package com.example.asus.cehua;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends AppCompatActivity {

    private Button button;
//我叫刘健瑞 侯增宇
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    initview();
        //创建SlidingMenu
         final SlidingMenu slidingMenu = new SlidingMenu(this);

        //设置侧滑方向
        slidingMenu.setMode(SlidingMenu.LEFT);
        //设置整个屏幕都能滑出
        //  slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        //设置整个屏幕不让滑出
        //  slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
        slidingMenu.setBehindOffset(200);
        //让侧滑依附到activity上
        slidingMenu.attachToActivity(MainActivity.this, SlidingMenu.SLIDING_CONTENT);
        //设置侧滑布局

        slidingMenu.setMenu(R.layout.meau);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initshow();
                slidingMenu.toggle();

            }
        });


    }

    private void initview() {
        button = (Button) findViewById(R.id.button);
    }

    private void initshow() {
        //fragment管理器
        FragmentManager fragmentManager = getSupportFragmentManager();
        //开启事务
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //替换
        transaction.add(R.id.menu, new MenuFragment());
        //提交
        transaction.commit();
        //用HomeFragment替换MainActivity
       // getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, new HomeFragment()).commit();


    }

}