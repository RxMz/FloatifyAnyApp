package com.todaysfuture.floatifycoc;

/**
 * Created by rishabh on 15/2/16.
 */

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

/**
 * Created by rishabh on 13/2/16.
 */
public class MainScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.startA);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainScreen.this,MainActivity.class);
                startService(intent);

            }
        });
    }



}
