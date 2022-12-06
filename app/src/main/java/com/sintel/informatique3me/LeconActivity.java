package com.sintel.informatique3me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class LeconActivity extends AppCompatActivity {

    // Leçons du chapitre 1
    Lecon lec1= new Lecon("Chapitre1",1,"Leçon 1: Les périphériques de l’ordinateur","lec1.html");
    Lecon lec2= new Lecon("Chapitre1",2,"Leçon 2: Les mémoires de l’ordinateur","lec2.html");

    // Leçons chap2
    Lecon lec3= new Lecon("Chapitre 2",3,"Leçon 3: Le logiciel système ","lec3.html");
    Lecon lec4= new Lecon("Chapitre 2",4,"Leçon 4: Le logiciel d’application","lec4.html");

    // leçon chap3
    Lecon lec5= new Lecon("Chapitre 3",5,"Leçon 5: Maintenance matérielle de l’ordinateur","lec5.html");
    Lecon lec6= new Lecon("Chapitre 3",6,"Leçon 6: Maintenance logicielle de l’ordinateur","lec6.html");

    // leçon chap4
    Lecon lec7= new Lecon("Chapitre 4",7,"Leçon 7: Les fichiers ","lec7.html");
    Lecon lec8= new Lecon("Chapitre 4",8,"Leçon 8: Configuration logicielle","lec8.html");
    Lecon lec9= new Lecon("Chapitre 4",9,"Leçon 9: Optimisation de l’ordinateur", "lec9.html");

    // leçon chap5
    Lecon lec10= new Lecon("Chapitre 5",10,"Leçon 10: Généralités sur le tableurs","lec10.html");
    Lecon lec11= new Lecon("Chapitre 5",11,"Leçon 11: Les fonctions de texte, date et heure","lec11.html");
    Lecon lec12= new Lecon("Chapitre 5",12,"Leçon 12: Les fonctions mathématiques", "lec12.html");
    Lecon lec13= new Lecon("Chapitre 5",13,"Leçon 13: Mise en forme conditionnelle","lec13.html");
    Lecon lec14= new Lecon("Chapitre 5",14,"Leçon 14: Insertion des graphiques dans un tableur", "lec14.html");

    // leçon chap6
    Lecon lec15= new Lecon("Chapitre 6",15,"Leçon 15: Généralités sur les systèmes de numération","lec15.html");
    Lecon lec16= new Lecon("Chapitre 6",16,"Leçon 16: Conversion d’un nombre d’une base à une autre","lec16.html");
    Lecon lec17= new Lecon("Chapitre 6",17,"Leçon 17: Opérations Arithmétiques dans la base 2", "lec17.html");

    // leçon chap7
    Lecon lec18= new Lecon("Chapitre 7",18,"Leçon 18: Généralités sur la codification de l’information","lec18.html");
    Lecon lec19= new Lecon("Chapitre 7",19,"Leçon 19: Le Codage des expressions en ASCII","lec19.html");

    // leçon chap8
    Lecon lec20= new Lecon("Chapitre 8",20,"Leçon 20: Les unités de mesure des données","lec20.html");
    Lecon lec21= new Lecon("Chapitre 8",21,"Leçon 21: Les unités de mesures des matériels","lec21.html");

    // leçon chap9
    Lecon lec22= new Lecon("Chapitre 9",22,"Leçon 22: La notion d’algorithme","lec22.html");
    Lecon lec23= new Lecon("Chapitre 9",23,"Leçon 23: Les instructions simples","lec23.html");
    Lecon lec24= new Lecon("Chapitre 9",24,"Leçon 24: Les structures de contrôle et Organigramme", "lec24.html");
    Lecon lec25= new Lecon("Chapitre 9",25,"Leçon 25: Exécution des algorithmes simples","lec25.html");

    String [] Chapitre1= new String[]{lec1.titre,lec2.titre};
    String [] Chapitre2= new String[]{lec3.titre,lec4.titre};
    String [] Chapitre3= new String[]{lec5.titre,lec6.titre};
    String [] Chapitre4= new String[]{lec7.titre,lec8.titre,lec9.titre};
    String [] Chapitre5= new String[]{lec10.titre,lec11.titre,lec12.titre,lec13.titre,lec14.titre};
    String [] Chapitre6= new String[]{lec15.titre,lec16.titre,lec17.titre};
    String [] Chapitre7= new String[]{lec18.titre,lec19.titre};
    String [] Chapitre8= new String[]{lec20.titre,lec21.titre};
    String [] Chapitre9= new String[]{lec22.titre,lec23.titre,lec24.titre,lec25.titre};

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

    public int j = Cours.i;

    public static int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecon);
        TextView textView = findViewById(R.id.titre_Chap);
        ListView listView= findViewById(R.id.liste_leçon);
        if (j==0) {
            ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Chapitre1);
            listView.setAdapter(ListViewAdapter);
            textView.setText("Chapitre 1 : " + description_chap[0]);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(LeconActivity.this,ContenuLecon.class);
                    startActivity(intent);
                    pos=position;
                }
            });
        }

        else if (j==1) {
            ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Chapitre2);
            listView.setAdapter(ListViewAdapter);
            textView.setText("Chapitre 2 : "+ description_chap[1]);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(LeconActivity.this,ContenuLecon.class);
                    startActivity(intent);
                    pos=position;
                }
            });
        }
        else  if (j==2) {
            ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Chapitre3);
            listView.setAdapter(ListViewAdapter);
            textView.setText("Chapitre 3 : " + description_chap[2]);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(LeconActivity.this,ContenuLecon.class);
                    startActivity(intent);
                    pos=position;
                }
            });
        }

        else if (j==3) {
            ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Chapitre4);
            listView.setAdapter(ListViewAdapter);
            textView.setText("Chapitre 4 : "+ description_chap[3]);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(LeconActivity.this,ContenuLecon.class);
                    startActivity(intent);
                    pos=position;
                }
            });
        }

        else if (j==4) {
            ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Chapitre5);
            listView.setAdapter(ListViewAdapter);
            textView.setText("Chapitre 5 : " + description_chap[4]);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(LeconActivity.this,ContenuLecon.class);
                    startActivity(intent);
                    pos=position;
                }
            });
        }

        else if (j==5) {
            ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Chapitre6);
            listView.setAdapter(ListViewAdapter);
            textView.setText("Chapitre 6 : "+ description_chap[5]);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(LeconActivity.this,ContenuLecon.class);
                    startActivity(intent);
                    pos=position;
                }
            });
        }
        else  if (j==6) {
            ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Chapitre7);
            listView.setAdapter(ListViewAdapter);
            textView.setText("Chapitre 7 : " + description_chap[6]);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(LeconActivity.this,ContenuLecon.class);
                    startActivity(intent);
                    pos=position;
                }
            });
        }

        else if (j==7) {
            ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Chapitre8);
            listView.setAdapter(ListViewAdapter);
            textView.setText("Chapitre 8 : "+ description_chap[7]);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(LeconActivity.this,ContenuLecon.class);
                    startActivity(intent);
                    pos=position;
                }
            });
        }
        else if (j==8) {
            ArrayAdapter<String> ListViewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Chapitre9);
            listView.setAdapter(ListViewAdapter);
            textView.setText("Chapitre 9 : "+ description_chap[8]);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent = new Intent(LeconActivity.this,ContenuLecon.class);
                    startActivity(intent);
                    pos=position;
                }
            });
        }

    }
}
