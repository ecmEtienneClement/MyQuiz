package etienne.clement.ecmquestionnaires.Vue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import etienne.clement.ecmquestionnaires.R;

public class ACCEUILLE extends AppCompatActivity {
    ACCEUILLE mMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuille);
        Button btn_commencer = (Button) findViewById(R.id.algotc1);
        Button btn_info = (Button) findViewById(R.id.xmltc3);
        Button btn_cours = (Button) findViewById(R.id.mescours);
        this.mMainActivity = this;

        btn_cours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TranslateAnimation translateAnimation = new TranslateAnimation(0, -550, 0, 0);
                translateAnimation.setDuration(1000);
                view.startAnimation(translateAnimation);
                Handler attendre = new Handler();
                attendre.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        AlertDialog.Builder rappelleCour = new AlertDialog.Builder(mMainActivity);
                        rappelleCour.setTitle("RAPPEL !");
                        rappelleCour.setMessage("Ces cours sont uniquement ceux du second semestre ...");
                        rappelleCour.setPositiveButton("OUI", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Intent page_commencer = new Intent(getApplicationContext(), Mescours.class);
                                startActivity(page_commencer);
                                overridePendingTransition(R.anim.entrantpage, R.anim.pagesortante);
                                finish();
                            }
                        });
                        rappelleCour.show();
                    }
                }, 1000);
            }

        });
    }

    public void page_commencer(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -550, 0, 0);
        translateAnimation.setDuration(1000);
        view.startAnimation(translateAnimation);
        Handler attendre = new Handler();
        attendre.postDelayed(new Runnable() {
            @Override
            public void run() {

               /* Toast commencer = Toast.makeText(getApplicationContext(), "Bien vous pouvez commencer", Toast.LENGTH_SHORT);
                View commencerView = commencer.getView();
                TextView txtView = commencerView.findViewById(android.R.id.message);
                txtView.setTextSize(18);
                commencer.show();*/

                Intent page_commencer = new Intent(getApplicationContext(), MENU.class);
                startActivity(page_commencer);
                overridePendingTransition(R.anim.entrantpage, R.anim.pagesortante);
                finish();

            }
        }, 1000);
    }


    public void info(View view) {
        Intent page_commencer = new Intent(getApplicationContext(), Apropos.class);
        startActivity(page_commencer);
        overridePendingTransition(R.anim.entrantpage, R.anim.pagesortante);
        finish();
    }

    public void regle(View view) {

        AlphaAnimation opacity = new AlphaAnimation(0, 1);
        opacity.setDuration(1000);
        view.startAnimation(opacity);
        AlertDialog.Builder regle = new AlertDialog.Builder(mMainActivity);
        regle.setTitle("Consigne ");
        regle.setMessage("Vous répondrez successivement aux questions posées en cliquant sur l'une des " +
                " réponses, un commentaire Bravo ! si la réponse choisie est la bonne, un retour clavier et affichage de la bonne réponse" +
                " si la réponse choisie est fausse, et en fin vous aurez votre résultat final a la fin de chaque séries de questions .");
        regle.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        regle.show();
    }
}