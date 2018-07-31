
package com.example.administrator.saredemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.saredemo.utils.AndroidShare;
import com.example.administrator.saredemo.utils.NativeUtils;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView share_id = (TextView) findViewById(R.id.share_id);
        share_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share_id.setText(NativeUtils.getStringFromNative());
            }
        });
    }
}
