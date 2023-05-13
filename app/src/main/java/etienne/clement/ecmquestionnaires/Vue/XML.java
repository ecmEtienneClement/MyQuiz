package etienne.clement.ecmquestionnaires.Vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import etienne.clement.ecmquestionnaires.R;

public class XML extends AppCompatActivity implements View.OnClickListener {
    public TextView ecm;
    public int progression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml);

        /*RECUPERATION DES ELEMENTS DE MA VUE*/
        Button tc1 = (Button) findViewById(R.id.xmltc1);
        Button tc2 = (Button) findViewById(R.id.xmltc2);
        Button tc3 = (Button) findViewById(R.id.xmltc3);
        Button menu = (Button) findViewById(R.id.xmlmenu);
        Button retour = (Button) findViewById(R.id.xmlretour);
        ecm = (TextView) findViewById(R.id.xmlecm);
        ecm.setVisibility(View.INVISIBLE);
        ProgressBar mprogressBar = (ProgressBar) findViewById(R.id.xmlprogressBar);

        /*ATTRIBUTION DE VALEUR A MES BOUTONS*/
        tc1.setTag(1);
        tc2.setTag(2);
        tc3.setTag(3);
        menu.setTag(4);
        retour.setTag(5);

        /*IMPLEMENTATION DE LA METHODE*/
        tc1.setOnClickListener(this);
        tc2.setOnClickListener(this);
        tc3.setOnClickListener(this);
        menu.setOnClickListener(this);
        retour.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int boutonCliquer = (int) view.getTag();
        ProgressBar mprogressBar = (ProgressBar) findViewById(R.id.xmlprogressBar);

        /*CHARGEMENT DU PROGRESSE BAR*/
        Timer temps = new Timer();
        TimerTask dureTemps = new TimerTask() {
            @Override
            public void run() {
                progression++;
                mprogressBar.setProgress(progression);
                if (progression == 100) {
                    temps.cancel();
                }
            }
        };

        /*ANIMATION BOUTON*/
        TranslateAnimation trans = new TranslateAnimation(0, -750, 0, 0);
        trans.setDuration(1000);
        view.startAnimation(trans);

        /*ATTENDRE AVANT DE FAIRE L'ACTION CLICK BOUTON*/
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
                            String page = "XMLTC1";
                            pageAction.putExtra("PageCharger", page);
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
                            String page = "XMLTC2";
                            pageAction.putExtra("PageCharger", page);
                            startActivity(pageAction);
                            finish();
                        }
                    }, 2000);
                }
                if (boutonCliquer == 3) {
                    ecm.setVisibility(View.VISIBLE);
                    temps.schedule(dureTemps, 0, 20);
                    /*Attendre pour le chargement du progresse Bar */
                    Handler encoreAttendre = new Handler();
                    encoreAttendre.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent pageAction = new Intent(getApplicationContext(), ACTION.class);
                            String page = "XMLTC3";
                            pageAction.putExtra("PageCharger", page);
                            startActivity(pageAction);
                            finish();
                        }
                    }, 2000);
                }
                if (boutonCliquer == 4) {
                    Intent pageAcceuille = new Intent(getApplicationContext(), ACCEUILLE.class);
                    startActivity(pageAcceuille);
                    finish();
                }
                if (boutonCliquer == 5) {
                    Intent pageMenu = new Intent(getApplicationContext(), MENU.class);
                    startActivity(pageMenu);
                    finish();
                }
            }
        }, 1000);


    }
}
