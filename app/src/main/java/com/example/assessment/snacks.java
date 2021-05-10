package com.example.assessment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class snacks extends AppCompatActivity {
    Integer price;





    List<String> items = new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
        Intent intent = getIntent();
        String selectedMuseum = intent.getStringExtra("bMuseum");
        setPrice(selectedMuseum);






    }
    void setPrice(String s){
        switch (s){
            case "museum 1":
            case "museum 2":
            case "museum 3":
            case "museum 4":
            case "museum 5":
                price = 10;
                ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);

                break;
            case "museum 6":
            case "museum 7":
            case "museum 8":
            case "museum 9":
            case "museum 10":
                price = 5;
                ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);

                break;


        }

    }
    public void addTea(View v){
        price = price + 1;
        items.add("Tea");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();


    }
    public void addWater(View v){
        price = price + 1;
        items.add("Water");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addCoffee(View v){
        price = price + 2;
        items.add("Coffee");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addFlat(View v){
        price = price + 2;
        items.add("Flatbread");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addSand(View v){
        price = price + 2;
        items.add("Sandwich");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addRoll(View v){
        price = price + 2;
        items.add("Sweetroll");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addShirt(View v){
        price = price + 10;
        items.add("Shirt");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addHat(View v){
        price = price + 5;
        items.add("Hat");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addSnow(View v){
        price = price + 5;
        items.add("Snow Globe");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addKey(View v){
        price = price + 5;
        items.add("Key Chain");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addBottle(View v){
        price = price + 5;
        items.add("Bottle");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addMug(View v){
        price = price + 5;
        items.add("Mug");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addCoaster(View v){
        price = price + 2;
        items.add("Coaster");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void addSalad(View v){
        price = price + 2;
        items.add("Salad");
        ((TextView)findViewById(R.id.priceTxt)).setText("Total so far £" + price);
        Toast.makeText(getApplicationContext(), "Added", Toast.LENGTH_LONG).show();
    }
    public void payFn(View v){
        Intent intent = new Intent(this,pay.class);
        intent.putExtra("fPrice", price);
        intent.putStringArrayListExtra("fItems", (ArrayList<String>) items);
        startActivity(intent);
    }




}