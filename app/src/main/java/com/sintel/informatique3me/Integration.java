package com.sintel.informatique3me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Integration extends AppCompatActivity {

    public  static int pos;
    String [] titre_chap = new String[] {
            "Fiche d'intégration 1: Architecture matérielle de l'ordinateur",
            "Fiche d'intégration 2 : Architecture logicielle de l'ordinateur ",
            "Fiche d'intégration 3 : La maintenance de l'ordinateur",
            "Fiche d'intégration 4 : La configuration de l'ordinateur ",
            "Fiche d'intégration 5 : Utilisation des tableurs",
            "Fiche d'intégration 6 : Utilisation de systèmes de numeration",
            "Fiche d'intégration 7 : Codification de l'information",
            "Fiche d'intégration 8 : Les unités de mesure en informatique",
            "Fiche d'intégration 9: Execution d'un algorithme"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integration);
        ListView listView = findViewById(R.id.integration);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(Integration.this , android.R.layout.simple_list_item_1, titre_chap );
        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Integration.this,FicheIntegration.class);
                startActivity(intent);
                pos=position;

            }
        });
    }
}
