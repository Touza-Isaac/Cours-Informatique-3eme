package com.sintel.informatique3me;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_options,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void Quitter(MenuItem item) {
        AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setTitle("Confirmer la fermeture !");
        alertDialogBuilder.setIcon(R.drawable.ic_warning_black_24dp);
        alertDialogBuilder.setMessage("Voulez-vous vraiment fermer l'application?");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("Non", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialogBuilder.setNeutralButton("Annuler", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        AlertDialog alertDialog= alertDialogBuilder.create();
        alertDialog.show();
    }

    public void Partager(MenuItem item) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        String app_url = "Télécharger l'application :Informatique 3ème en cliquant sur le lien : https://play.google.com/store/apps/details?id=com.sintel.informatique3eme";
        shareIntent.putExtra(Intent.EXTRA_TEXT, app_url);
        startActivity(Intent.createChooser(shareIntent, "Partager via"));
    }

    public void propos(MenuItem item) {
        Intent intent = new Intent(this, APropos.class);
        startActivity(intent);
    }

    public void cours(View view) {
        Intent intent = new Intent(this, Cours.class);
        startActivity(intent);
    }

    public void integration(View view) {
        Intent intent = new Intent(this, Integration.class);
        startActivity(intent);
    }
    public void corriges(View view) {
        Intent intent = new Intent(this, Corriges.class);
        startActivity(intent);
    }
    public void examen(View view) {
        Intent intent = new Intent(this, Examen.class);
        startActivity(intent);
    }
}
