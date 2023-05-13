package etienne.clement.ecmquestionnaires.Vue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import etienne.clement.ecmquestionnaires.Model.AproposModel;
import etienne.clement.ecmquestionnaires.Model.GestionnaireListeView;
import etienne.clement.ecmquestionnaires.R;

public class Apropos extends AppCompatActivity {
    //public TextView commentaire;
    ListView mavueliste;
    public ArrayList<AproposModel> mMaliste;
    public GestionnaireListeView mGestionnaireListeView;
    Apropos mApropos;
    public TextView lien;
   // public Button btnretour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apropos);
        // commentaire = (TextView) findViewById(R.id.commentaire);
        // commentaire.setMovementMethod(LinkMovementMethod.getInstance());
        //....
       // btnretour = (Button)findViewById(R.id.proposretour);
        mApropos = this;
        lien = (TextView)findViewById(R.id.proposlien);
        lien.setVisibility(View.INVISIBLE);
        mavueliste = (ListView) findViewById(R.id.liste);
        mGestionnaireListeView = new GestionnaireListeView(getApplicationContext(), 0);
        mMaliste = new ArrayList<>();


        mMaliste.add(new AproposModel("Nom Application", "ECM_FANTÔME_TCS2"));
        mMaliste.add(new AproposModel("IDE", "Android Studio"));
        mMaliste.add(new AproposModel("Langage ", "Java"));
        mMaliste.add(new AproposModel("Architecture", "MVC"));
        mMaliste.add(new AproposModel("Programmation", "POO"));
        mMaliste.add(new AproposModel("Programmer Par ", "ETIENNE CLEMENT MBAYE"));
        mMaliste.add(new AproposModel("Info", "ECM_FANTÔME est une application composée des testes de" +
                " connaissances du second semestre de la licence 1 en IDA, facilitant la révision pour les examens" +
                " du second semestre, l'accès au Service d'Authentification et Portail UVS. Celle-ci est la première parti" +
                " du projet voir le teste l'objectif en est de faire une regroupant l'ensemble des testes de connaissances de" +
                " touts les semestres et licences . \n ECM ( ETIENNE CLEMENT MBAYE ) Promotion 7 IDA"));
        mMaliste.add(new AproposModel("Commentaire", "Un demande d'envoi d'un commentaire de votre part vous serez proposer" +
                " à la sortie de cette page .\nMerci de laisser votre commentaire ... "));
        mavueliste.setAdapter(mGestionnaireListeView);
        mGestionnaireListeView.addAll(mMaliste);

    }

    public void Aproposretour(View view) {
        TranslateAnimation trans = new TranslateAnimation(0, -450, 0, 0);
        trans.setDuration(1000);
        view.startAnimation(trans);
        Handler attendre = new Handler();

        attendre.postDelayed(new Runnable() {
            @Override
            public void run() {

                AlertDialog.Builder commentaire = new AlertDialog.Builder(mApropos);
                commentaire.setTitle("DEMANDE D'ENVOI");
                commentaire.setMessage("Voulez vous envoyer un commentaire ?");
                commentaire.setPositiveButton( Html.fromHtml("Oui"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                     lien.setVisibility(View.VISIBLE);
                     lien.setText( Html.fromHtml("<a href='https://docs.google.com/forms/d/e/1FAIpQLSeYZ769J2Y6n9a1RcCRQDqGADFx1v48v1uajyYozON7B4W4Pg/viewform?usp=sf_link'>Cliquer ici pour envoyer votre commentaire...</a>"));
                     lien.setMovementMethod(LinkMovementMethod.getInstance());
                    }

                });
                commentaire.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent pageAcceuille = new Intent(getApplicationContext(), ACCEUILLE.class);
                        startActivity(pageAcceuille);

                        finish();
                    }
                });
                commentaire.show();

            }
        }, 1000);
    }
}