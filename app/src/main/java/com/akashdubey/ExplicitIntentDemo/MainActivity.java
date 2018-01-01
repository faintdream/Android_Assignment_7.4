package com.akashdubey.ExplicitIntentDemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     EditText username, password;
     Button login;
     static String USERNAME_KEY="WHOAMI";
     Bundle sessionInfo;
     Intent outgoing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.usernameET);
        password=(EditText)findViewById(R.id.passwordET);
        login=(Button)findViewById(R.id.loginBtn);


       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               outgoing = new Intent(MainActivity.this,Profile.class);
               outgoing.putExtra(USERNAME_KEY,username.getText().toString());
               startActivity(outgoing);
           }
       });




    }




}
