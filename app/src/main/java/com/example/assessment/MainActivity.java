package com.example.assessment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addNewUserFun(View view){
        myDBConnector dbHandler = new myDBConnector(this,null,null,1);
        EditText name = (EditText) findViewById(R.id.nameTxt);
        EditText userName = (EditText) findViewById(R.id.userNameTxt);
        EditText password = (EditText) findViewById(R.id.pwdTxt);

        dbHandler.addNewUser(name.getText().toString(),
                userName.getText().toString(),
                password.getText().toString());

        Toast.makeText(getApplicationContext(),
                "successfully registered with the following details\n" +
                        dbHandler.findUser(userName.getText().toString()),
                Toast.LENGTH_LONG).show();

    }
    public void loginPageFun(View v){
        Intent intent = new Intent(this,LoginPage.class);
        startActivity(intent);
    }
}