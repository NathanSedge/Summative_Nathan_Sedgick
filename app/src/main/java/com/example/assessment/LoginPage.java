package com.example.assessment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }
    public void loginFn(View v){
        EditText userName = (EditText) findViewById(R.id.userNameTxt2);
        EditText password = (EditText) findViewById(R.id.pwdTxt2);

        myDBConnector objDBConnector = new myDBConnector(this,null,null,1);

        if(objDBConnector.checkLogin(userName.getText().toString(), password.getText().toString())){
            Intent intent = new Intent(this,Mlist.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Failed Login, Wrong Details", Toast.LENGTH_LONG).show();
        }
    }
    public void guestFun(View v){
        Intent intent = new Intent(this,Mlist.class);
        startActivity(intent);
    }
}