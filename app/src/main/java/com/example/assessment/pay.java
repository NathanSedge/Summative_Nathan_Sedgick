package com.example.assessment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class pay extends AppCompatActivity {
    int price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("fPrice", 0);
        setPrice(intValue);
        ArrayList<String> items = getIntent().getStringArrayListExtra("fItems");
        ((TextView)findViewById(R.id.list)).setText("Extras:\n" + items);

    }
    void setPrice(int i){
        price = i;
        ((TextView)findViewById(R.id.priceDisplay)).setText("Total: £" + price);
    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public void payFn(View v){
        EditText money = findViewById(R.id.money);
        int moneyGiven = Integer.parseInt(money.getText().toString());

        if (moneyGiven >= price){
            int change = moneyGiven - price;
            ((TextView)findViewById(R.id.change)).setText("Change: £" + change);
            ((TextView)findViewById(R.id.priceDisplay)).setText("PAID");
            int code = getRandomNumber(100000,999999);
            ((TextView)findViewById(R.id.booking)).setText("Booking code:" + code);


        }
        else{
            Toast.makeText(getApplicationContext(), "Insufficient Funds", Toast.LENGTH_LONG).show();
        }
    }

}