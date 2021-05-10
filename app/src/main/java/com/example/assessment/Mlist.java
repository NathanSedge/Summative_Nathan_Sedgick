package com.example.assessment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Mlist extends AppCompatActivity {

    adapter adapterObj;
    ArrayList<museum> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlist);

        dataList = new ArrayList<>();
        dataList.add(new museum("Louvre", "The Louvre or the Louvre Museum is the world's largest art museum and a historic monument in Paris"));
        dataList.add(new museum("National Museum of China", "The National Museum of China flanks the eastern side of Tiananmen Square in Beijing,"));
        dataList.add(new museum("Vatican Museums", "The Vatican Museums host the most important and largest art collection in the world"));
        dataList.add(new museum("Metropolitan Museum of Art", "The museum is home to encyclopedic collections."));
        dataList.add(new museum("British Museum", "The first national public museum of the world."));
        dataList.add(new museum("Tate Modern", "Tate Modern is London's new modern art gallery."));
        dataList.add(new museum("National Gallery ", "The National Gallery is an art museum in Trafalgar Square in the City of Westminster,"));
        dataList.add(new museum("National History Museum", "The Museum is a world-class visitor attraction and leading science research centre"));
        dataList.add(new museum("American Museum of Natural History", "American Museum of Natural History, institute established in New York City in 1869. "));
        dataList.add(new museum("State Hermitage Museum", "The State Hermitage Museum is one of the largest artistic and cultural and historical museums in Russia."));

        RecyclerView recyclerObj = findViewById(R.id.recyclerID);
        recyclerObj.setLayoutManager(new LinearLayoutManager(this));
        adapterObj = new adapter(this,dataList);
        recyclerObj.setAdapter(adapterObj);
    }
}