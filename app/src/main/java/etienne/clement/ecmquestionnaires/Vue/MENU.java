package etienne.clement.ecmquestionnaires.Vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import etienne.clement.ecmquestionnaires.R;

public class MENU extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //RECUPERATION DES ELEMENTS DE MA VUE....
        Button html = (Button)findViewById(R.id.html5);
        Button css3 = (Button)findViewById(R.id.css3);
        Button js = (Button)findViewById(R.id.js);
        Button xml = (Button)findViewById(R.id.xml);
        Button c = (Button)findViewById(R.id.c);
        Button algo = (Button)findViewById(R.id.algo);
        Button retour= (Button)findViewById(R.id.retour);
        //Attribut d'un chiffre a mes boutons pour repert de bouton cliquer..
        html.setTag(1);
        css3.setTag(2);
        js.setTag(3);
        xml.setTag(4);
        c.setTag(5);
        algo.setTag(7);
        retour.setTag(6);
        //Pointage du clique sur mes boutons...
        html.setOnClickListener(this);
        css3.setOnClickListener(this);
        js.setOnClickListener(this);
        xml.setOnClickListener(this);
        c.setOnClickListener(this);
        algo.setOnClickListener(this);
        retour.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int choix =(int) view.getTag();
        /*NAVIGER VERS LA PAGE D'ACCEUILLE*/
    if(choix ==6){
        TranslateAnimation trans = new TranslateAnimation(0,-450,0,0);
        trans.setDuration(1000);
        view.startAnimation(trans);
        Handler attendre = new Handler();
        attendre.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pageAcceuille = new Intent(getApplicationContext(), ACCEUILLE.class);
                startActivity(pageAcceuille);

                finish();
            }
        },1000);
    }/*NAVIGER VERS LA PAGE HTML5*/
        if(choix ==1){
            TranslateAnimation trans = new TranslateAnimation(0,-450,0,0);
            trans.setDuration(1000);
            view.startAnimation(trans);
            Handler attendre = new Handler();
            attendre.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent pageAcceuille = new Intent(getApplicationContext(), HTML5.class);

                    startActivity(pageAcceuille);
                    overridePendingTransition(R.anim.entrantpage, R.anim.pagesortante);
                    finish();
                }
            },1000);
        }
        /*NAVIGER LA PAGE CSS3*/
            if(choix ==2){
                TranslateAnimation trans = new TranslateAnimation(0,-450,0,0);
                trans.setDuration(1000);
                view.startAnimation(trans);
                Handler attendre = new Handler();
                attendre.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent pageAcceuille = new Intent(getApplicationContext(), CSS3.class);
                        startActivity(pageAcceuille);
                        overridePendingTransition(R.anim.entrantpage, R.anim.pagesortante);
                        finish();
                    }
                },1000);
            }
            /*NAVIGER VERS LA PAGE JAVASCRIPT2*/
        if(choix ==3){
            TranslateAnimation trans = new TranslateAnimation(0,-450,0,0);
            trans.setDuration(1000);
            view.startAnimation(trans);
            Handler attendre = new Handler();
            attendre.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent pageAcceuille = new Intent(getApplicationContext(), JAVASCRIPT2.class);
                    startActivity(pageAcceuille);
                    overridePendingTransition(R.anim.entrantpage, R.anim.pagesortante);
                    finish();
                }
            },1000);
        }/*NAVIGER LA PAGE XML*/
                if(choix ==4){
                    TranslateAnimation trans = new TranslateAnimation(0,-450,0,0);
                    trans.setDuration(1000);
                    view.startAnimation(trans);
                    Handler attendre = new Handler();
                    attendre.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent pageAcceuille = new Intent(getApplicationContext(), XML.class);
                            startActivity(pageAcceuille);
                            overridePendingTransition(R.anim.entrantpage, R.anim.pagesortante);
                            finish();
                        }
                    },1000);
                }
                /*NAVIGER VERS LA PAGE C*/
        if(choix ==5){
            TranslateAnimation trans = new TranslateAnimation(0,-450,0,0);
            trans.setDuration(1000);
            view.startAnimation(trans);
            Handler attendre = new Handler();
            attendre.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent pageAcceuille = new Intent(getApplicationContext(), C.class);
                    startActivity(pageAcceuille);
                    overridePendingTransition(R.anim.entrantpage, R.anim.pagesortante);
                    finish();
                }
            },1000);
        }
        if(choix ==7){
            TranslateAnimation trans = new TranslateAnimation(0,-450,0,0);
            trans.setDuration(1000);
            view.startAnimation(trans);
            Handler attendre = new Handler();
            attendre.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent pageAcceuille = new Intent(getApplicationContext(), ALGO.class);
                    startActivity(pageAcceuille);
                    overridePendingTransition(R.anim.entrantpage, R.anim.pagesortante);
                    finish();
                }
            },1000);
        }
  }
 }