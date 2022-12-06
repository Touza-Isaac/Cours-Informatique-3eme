package com.sintel.informatique3me;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.LENGTH_SHORT;

public class Cours extends AppCompatActivity {

    public static int i;

    String [] titre_chap = new String[] {
            "Chapitre 1 : ",
            "Chapitre 2 : ",
            "Chapitre 3 : ",
            "Chapitre 4 : ",
            "Chapitre 5 : ",
            "Chapitre 6 : ",
            "Chapitre 7 : ",
            "Chapitre 8 : ",
            "Chapitre 9: "
    };

    int [] image = new int[] {
            R.drawable.chap1,
            R.drawable.chap2,
            R.drawable.chap3,
            R.drawable.chap4,
            R.drawable.chap5,
            R.drawable.chap6,
            R.drawable.chap7,
            R.drawable.chap8,
            R.drawable.chap9
    };

    public  String [] description_chap = new String[] {
            "Architecture matérielle de l'ordinateur  ",
            "Architecture logicielle de l'ordinateur ",
            "La maintenance de l'ordinateur  ",
            "La configuration de l'ordinateur ",
            "Utilisation des tableurs ",
            "Utilisation de systèmes de numeration ",
            "Codification de l'information  ",
            "Les unités de mesure en informatique  ",
            "Execution d'un algorithme ",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours);

        ListView listView = findViewById(R.id.listeChapitre);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Cours.this,LeconActivity.class);
                startActivity(intent);
                i=position;
            }
        });
    }


    class  CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View  view = getLayoutInflater().inflate(R.layout.custom_layout, null);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageliste);
            TextView textView_name=(TextView)view.findViewById(R.id.titleText);
            TextView textView_description=(TextView)view.findViewById(R.id.descriptionchap);

            imageView.setImageResource(image[position]);
            textView_name.setText(titre_chap[position]);
            textView_description.setText(description_chap[position]);

            return view;
        }
    }

}
