package com.birk5437.discgolf;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

import android.widget.*;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;

public class MainMenu extends Activity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button btnPlay = (Button)findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(this);

        Button btnExit = (Button)findViewById(R.id.btnExit);
        btnExit.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }

    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btnExit:
                finish();
                break;
            case R.id.btnPlay:
                Intent game = new Intent(MainMenu.this, Game.class);
                startActivity(game);
                break;
        }
    }

    
}
