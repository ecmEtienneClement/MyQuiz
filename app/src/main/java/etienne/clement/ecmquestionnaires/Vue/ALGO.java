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

public class ALGO extends AppCompatActivity implements View.OnClickListener {
    public TextView ecm;
    public int progression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_l_g_o);

        /*RECUPERATION DES ELEMENT DE MA VUE*/
        Button tc1 = (Button) findViewById(R.id.algotc1);
        Button tc2 = (Button) findViewById(R.id.algotc2);
        Button retour = (Button) findViewById(R.id.courretour);
        Button menu = (Button) findViewById(R.id.algomenu);
        ecm = (TextView) findViewById(R.id.algoecm);
        ecm.setVisibility(View.INVISIBLE);

        /*ATTRIBUTION DE VALEUR AUX BOUTONS*/
        tc1.setTag(1);
        tc2.setTag(2);
        retour.setTag(3);
        menu.setTag(4);

        tc1.setOnClickListener(this);
        tc2.setOnClickListener(this);
        retour.setOnClickListener(this);
        menu.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int boutonCliquer = (int)view.getTag();
        //CHARGEMENT DU PROGGRESSE BAR
        ProgressBar mProgresseBar = (ProgressBar) findViewById(R.id.algoprogressBar);
        Timer temps = new Timer();
        TimerTask dureTemps = new TimerTask() {
            @Override
            public void run() {
                progression++;
                mProgresseBar.setProgress(progression);
                if (progression == 100) {
                    temps.cancel();
                }
            }
        };
        //MISE EN PLACE  DE L'ANIMATION...
        TranslateAnimation trans = new TranslateAnimation(0,-750,0,0);
        view.startAnimation(trans);
        //ATTENDRE LA FIN DE L'ANIMATION AVANT  DE PASSER A L'ACTION....

        Handler attendre  =  new Handler();
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
                            String page= "ALGOTC1";
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
                            String page= "ALGOTC2";
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
        },1000);

    }
}