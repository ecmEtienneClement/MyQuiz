package etienne.clement.ecmquestionnaires.Vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import etienne.clement.ecmquestionnaires.R;

public class HTML5 extends AppCompatActivity implements View.OnClickListener {
    int progression;
    TextView ecm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html5);

        /*RECUPERATION DES ELEMENTS DE MA VUE*/
        Button tc1 = (Button) findViewById(R.id.htmltc1);
        Button tc2 = (Button) findViewById(R.id.htmltc2);
        Button retour = (Button) findViewById(R.id.htmlretour);
        Button menu = (Button) findViewById(R.id.htmlmenu);
        ecm = (TextView) findViewById(R.id.ecm);
        ecm.setVisibility(View.INVISIBLE);
        ProgressBar mProgressBar = (ProgressBar) findViewById(R.id.progressBar2);

        /*ATTRIBUTION DE VALEURS A MES BOUTONS*/
        tc1.setTag(1);
        tc2.setTag(2);
        retour.setTag(3);
        menu.setTag(4);
        /*REFERENCE DE LA METHODE CLIQUE PAR LE BOUTON*/
        tc1.setOnClickListener(this);
        tc2.setOnClickListener(this);
        retour.setOnClickListener(this);
        menu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        ProgressBar mProgressBar = (ProgressBar) findViewById(R.id.progressBar2);
        /*Mise en place du chargement progresse Bar*/
        Timer temps = new Timer();
        TimerTask dureTemps = new TimerTask() {
            @Override
            public void run() {
                progression++;
                mProgressBar.setProgress(progression);
                if (progression == 100) {
                    temps.cancel();
                }
            }
        };
        int boutonCliquer = (int) view.getTag();
        TranslateAnimation trans = new TranslateAnimation(0, -750, 0, 0);
        trans.setDuration(1000);
        view.startAnimation(trans);
        Handler attendre = new Handler();
        attendre.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (boutonCliquer == 1) {
                    ecm.setVisibility(View.VISIBLE);
                    temps.schedule(dureTemps, 0, 20);
                    /*Attendre pour le chargement du progresse Bar */
                    Handler encoreAttendre = new Handler();
                    encoreAttendre.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent pageAction = new Intent(getApplicationContext(), ACTION.class);
                            String page= "HTML5TC1";
                            pageAction.putExtra("PageCharger",page);
                            startActivity(pageAction);
                            finish();
                        }
                    }, 2000);
                }
                if (boutonCliquer == 2) {
                    ecm.setVisibility(View.VISIBLE);
                    temps.schedule(dureTemps, 0, 20);
                    /*Attendre pour le chargement du progresse Bar */
                    Handler encoreAttendre = new Handler();
                    encoreAttendre.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent pageAction = new Intent(getApplicationContext(), ACTION.class);
                            String page= "HTML5TC2";
                            pageAction.putExtra("PageCharger",page);
                            startActivity(pageAction);
                            finish();
                        }
                    }, 2000);
                }
                if (boutonCliquer == 3) {
                    Intent pageMenu = new Intent(getApplicationContext(), MENU.class);
                    startActivity(pageMenu);
                    finish();
                }
                if (boutonCliquer == 4) {
                    Intent pageAcceuille = new Intent(getApplicationContext(), ACCEUILLE.class);
                    startActivity(pageAcceuille);
                    finish();
                }
            }
        }, 1000);


    }

}