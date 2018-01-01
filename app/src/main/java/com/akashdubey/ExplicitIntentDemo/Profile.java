package com.akashdubey.ExplicitIntentDemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by FLAdmin on 1/1/2018.
 */

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_login);

        Intent incoming = getIntent();
        String username;
        TextView usernameTV;
        Bundle sessionInfo;
        usernameTV=(TextView)findViewById(R.id.usernameTV);

        sessionInfo=incoming.getExtras();
        username=sessionInfo.getString(MainActivity.USERNAME_KEY);
        usernameTV.setText(usernameTV.getText().toString()+" "+ username);
        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
    }
}
