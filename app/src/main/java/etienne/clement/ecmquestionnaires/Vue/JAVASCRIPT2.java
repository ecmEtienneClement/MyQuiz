package etienne.clement.ecmquestionnaires.Vue;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

import etienne.clement.ecmquestionnaires.R;

public class JAVASCRIPT2 extends AppCompatActivity implements View.OnClickListener {
    public TextView ecm;
    public int progression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_javascript2);
        /*RECUPERATION DES ELEMENTS DE MA VUE*/

        Button tc1 = (Button) findViewById(R.id.algotc1);
        Button tc2 = (Button) findViewById(R.id.algotc2);
        Button tc3 = (Button) findViewById(R.id.xmltc3);
        Button tc4 = (Button) findViewById(R.id.jstc4);
        Button tc5 = (Button) findViewById(R.id.jstc5);
        Button menu = (Button) findViewById(R.id.algomenu);
        Button retour = (Button) findViewById(R.id.courretour);
        ecm = (TextView) findViewById(R.id.jsecm);
        ecm.setVisibility(View.INVISIBLE);
        ProgressBar mprogressBar = (ProgressBar) findViewById(R.id.jsprogressBar);

        /*ATTRIBUTION DE VALEUR AUX BOUTONS*/
        tc1.setTag(1);
        tc2.setTag(2);
        tc3.setTag(3);
        tc4.setTag(4);
        tc5.setTag(5);
        menu.setTag(6);
        retour.setTag(7);

        /*REFERENCE DU CLICK AU BOUTON*/
        tc1.setOnClickListener(this);
        tc2.setOnClickListener(this);
        tc3.setOnClickListener(this);
        tc4.setOnClickListener(this);
        tc5.setOnClickListener(this);
        menu.setOnClickListener(this);
        retour.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int boutonClicker = (int) view.getTag();
        ProgressBar mprogressBar = (ProgressBar) findViewById(R.id.jsprogressBar);

        /*CHARGEMENT DE LA PROGRESSION PROGRESS BAR*/
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
        TranslateAnimation tran = new TranslateAnimation(0, -750, 0, 0);
        tran.setDuration(1000);
        view.startAnimation(tran);

        /*EVENEMENT DU CLICK BOUTON ATTENDRE POUT TERMINER L'ANIMATION AVANT FAIRE ACTION DE L'EVENEMENT*/
        Handler attendre = new Handler();
        attendre.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (boutonClicker == 1) {
                    ecm.setVisibility(View.VISIBLE);
                    temps.schedule(dureTemps, 0, 20);
                    /*Attendre pour le chargement du progresse Bar */
                    Handler encoreAttendre = new Handler();
                    encoreAttendre.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent pageAction = new Intent(getApplicationContext(), ACTION.class);
                            String page = "JSTC1";
                            pageAction.putExtra("PageCharger", page);
                            startActivity(pageAction);
                            finish();
                        }
                    }, 2000);
                }
                if (boutonClicker == 2) {
                    ecm.setVisibility(View.VISIBLE);
                    temps.schedule(dureTemps, 0, 20);
                    /*Attendre pour le chargement du progresse Bar */
                    Handler encoreAttendre = new Handler();
                    encoreAttendre.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent pageAction = new Intent(getApplicationContext(), ACTION.class);
                            String page = "JSTC2";
                            pageAction.putExtra("PageCharger", page);
                            startActivity(pageAction);
                            finish();
                        }
                    }, 2000);
                }
                if (boutonClicker == 3) {
                    ecm.setVisibility(View.VISIBLE);
                    temps.schedule(dureTemps, 0, 20);
                    /*Attendre pour le chargement du progresse Bar */
                    Handler encoreAttendre = new Handler();
                    encoreAttendre.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent pageAction = new Intent(getApplicationContext(), ACTION.class);
                            String page = "JSTC3";
                            pageAction.putExtra("PageCharger", page);
                            startActivity(pageAction);
                            finish();
                        }
                    }, 2000);
                }
                if (boutonClicker == 4) {
                    ecm.setVisibility(View.VISIBLE);
                    temps.schedule(dureTemps, 0, 20);
                    /*Attendre pour le chargement du progresse Bar */
                    Handler encoreAttendre = new Handler();
                    encoreAttendre.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent pageAction = new Intent(getApplicationContext(), ACTION.class);
                            String page = "JSTC4";
                            pageAction.putExtra("PageCharger", page);
                            startActivity(pageAction);
                            finish();
                        }
                    }, 2000);

                }
                if (boutonClicker == 5) {
                    ecm.setVisibility(View.VISIBLE);
                    temps.schedule(dureTemps, 0, 20);
                    /*Attendre pour le chargement du progresse Bar */
                    Handler encoreAttendre = new Handler();
                    encoreAttendre.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent pageAction = new Intent(getApplicationContext(), ACTION.class);
                            String page = "JSTC5";
                            pageAction.putExtra("PageCharger", page);
                            startActivity(pageAction);
                            finish();
                        }
                    }, 2000);
                }
                if (boutonClicker == 6) {
                    Intent pageMenu = new Intent(getApplicationContext(), ACCEUILLE.class);
                    startActivity(pageMenu);
                    finish();
                }
                if (boutonClicker == 7) {
                    Intent pageAcceuille = new Intent(getApplicationContext(), MENU.class);
                    startActivity(pageAcceuille);
                    finish();
                }
            }
        }, 1000);

    }
}
