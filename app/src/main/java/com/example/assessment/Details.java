package com.example.assessment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    String museum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        Intent intent = getIntent();
        String selectedMuseum = intent.getStringExtra("selectedMuseum");

        setDetail(selectedMuseum);
    }

    void setDetail(String s){
            switch (s){
                case "Louvre":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.lovre);

                    museum = "museum 1";

                    ((TextView)findViewById(R.id.detailTxt)).setText("The Louvre is the world's largest museum and houses one of the most impressive art collections in history. The magnificent, baroque-style palace and museum — LeMusée du Louvre in French — sits along the banks of the Seine River in Paris. It is one of the city's biggest tourist attractions.\n\n Price: £10");
                    break;
                case "National Museum of China":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.china2);

                    museum = "museum 2";

                    ((TextView)findViewById(R.id.detailTxt)).setText("The National Museum of China flanks the eastern side of Tiananmen Square in Beijing, China. The museum's mission is to educate about the arts and history of China. It is directed by the Ministry of Culture of the People's Republic of China.\n\n Price: £10" );
                    break;
                case "Vatican Museums":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.vatican);

                    museum = "museum 3";

                    ((TextView)findViewById(R.id.detailTxt)).setText("The Vatican Museums bring together one of the most impressive and extensive collections in the world belonging to the Catholic Church, they have more than 70,000 exhibits in an area of 42,000 meters.\n\n Price: £10 " );
                    break;
                case "Metropolitan Museum of Art":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.met);

                    museum = "museum 4";

                    ((TextView)findViewById(R.id.detailTxt)).setText("The museum is home to encyclopedic collections of musical instruments, costumes, and accessories, as well as antique weapons and armor from around the world. Several notable interiors, ranging from 1st-century Rome through modern American design, are installed in its galleries.\n\n Price: £10");
                    break;
                case "British Museum":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.brit);

                    museum = "museum 5";

                    ((TextView)findViewById(R.id.detailTxt)).setText("The British Museum was founded in 1753 and opened its doors in 1759. It was the first national museum to cover all fields of human knowledge, open to visitors from across the world.\n\n Price: £10 " );
                    break;
                case "Tate Modern":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.tm);

                    museum = "museum 6";

                    ((TextView)findViewById(R.id.detailTxt)).setText("Tate Modern is London's new modern art gallery displaying modern and contemporary art from 1900 to the current day. It occupies the converted brick clad Bankside power station on the south bank of the River Thames and opposite St Pauls's cathedral.\n\n Price: £5" );
                    break;
                case "National Gallery ":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.ng);

                    museum = "museum 7";

                    ((TextView)findViewById(R.id.detailTxt)).setText("The National Gallery is an art museum in Trafalgar Square in the City of Westminster, in Central London. Founded in 1824, it houses a collection of over 2,300 paintings dating from the mid-13th century to 1900.\n\n Price: £5");
                    break;
                case "National History Museum":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.nhm);

                    museum = "museum 8";

                    ((TextView)findViewById(R.id.detailTxt)).setText("The Museum is a world-class visitor attraction and leading science research centre. We use our unique collections and unrivalled expertise to tackle the biggest challenges facing the world today. We care for more than 80 million objects spanning billions of years and welcome more than five million visitors annually.\n\n Price: £5 " );
                    break;
                case "American Museum of Natural History":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.amnh);

                    museum = "museum 9";

                    ((TextView)findViewById(R.id.detailTxt)).setText("American Museum of Natural History, institute established in New York City in 1869. It is a major centre of research and education on the natural sciences. It pioneered in mounting field expeditions and in creating dioramas and other lifelike exhibits showing natural habitats and their plant and animal life.\n\n Price: £5" );
                    break;
                case "State Hermitage Museum":
                    ((ImageView)findViewById(R.id.museumImg)).setImageResource(R.drawable.shm);

                    museum = "museum 10";

                    ((TextView)findViewById(R.id.detailTxt)).setText("The State Hermitage Museum is one of the largest artistic and cultural and historical museums in Russia and one of the largest in the world. The museum starts its history from collections of works of art which were gained by Russian empress Catherine II in private capacity.\n\n Price: £5 " );
                    break;
            }

    }
    public void bookFun(View v){
        Intent intent = new Intent(this, snacks.class);
        intent.putExtra("bMuseum", museum);
        startActivity(intent);
    }
}