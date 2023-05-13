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

public class C extends AppCompatActivity implements View.OnClickListener {
    public TextView ecm;
    public int progression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        /*RECUPERATION DES ELEMENT DE MA VUE*/
        Button tc1 = (Button) findViewById(R.id.ctc1);
        Button tc2 = (Button) findViewById(R.id.ctc2);
        Button retour = (Button) findViewById(R.id.cretour);
        Button menu = (Button) findViewById(R.id.cmenu);
        ecm = (TextView) findViewById(R.id.cecm);
        ecm.setVisibility(View.INVISIBLE);

        /*ATTRIBUTION DE VALEUR AUX BOUTONS*/
        tc1.setTag(1);
        tc2.setTag(2);
        retour.setTag(3);
        menu.setTag(4);

        /*IMPLEMANTATION D'EVENEMENT CLICK AUX BOUTONS*/
        tc1.setOnClickListener(this);
        tc2.setOnClickListener(this);
        retour.setOnClickListener(this);
        menu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int boutonCliquer = (int) view.getTag();
        ProgressBar mprogressBar = (ProgressBar) findViewById(R.id.cprogressBar);

        /*CHARGEMENT DU PROGRESS BAR*/
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

        /*ATTENDRE POUR LE TEMPS DE L'ANIMATION AVANT FAIRE ACTION DE L'EVENEMENT DU CLICK BOUTON*/
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
                                                 String page= "CTC1";
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
                                                 String page ="CTC2";
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
                             }
                , 1000);
    }
}