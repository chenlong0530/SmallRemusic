package com.cl.remusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                if (Small.openUri("main", MainActivity.this)) {
                    finish();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Open failed, see log for detail!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
