package com.example.myapplication;

import android.os.Bundle;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;
import android.app.TabActivity;
import android.os.Bundle;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TabHost;
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost=getTabHost();
        TabHost.TabSpec Hamster=tabHost.newTabSpec("ham").setIndicator("햄스터");
        Hamster.setContent(R.id.ham);
        tabHost.addTab(Hamster);
        TabHost.TabSpec Rabbit=tabHost.newTabSpec("토끼").setIndicator("토끼");
        Rabbit.setContent(R.id.rabbit);
        tabHost.addTab(Rabbit);
        TabHost.TabSpec Snake=tabHost.newTabSpec("snake").setIndicator("뱀");
        Snake.setContent(R.id.snake);
        tabHost.addTab(Snake);
        TabHost.TabSpec Tiger=tabHost.newTabSpec("tiger").setIndicator("호랑이");
        Tiger.setContent(R.id.tiger);
        tabHost.addTab(Tiger);
        tabHost.setCurrentTab(0);
    }
}