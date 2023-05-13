package etienne.clement.ecmquestionnaires.Vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import etienne.clement.ecmquestionnaires.R;

import static android.text.method.LinkMovementMethod.*;

public class RESULTAT extends AppCompatActivity {
    //Recuperation des elements de ma vue
    TextView txtnote;
    TextView txtresult;
    TextView txtappre;
    Button valider;
    Button recommencer;
    TextView appreciation;


    String pageChargerCopi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        //instancification de mes objets...
        txtnote = (TextView) findViewById(R.id.txtnote);

        txtresult = (TextView) findViewById(R.id.txtresult);
        txtappre = (TextView) findViewById(R.id.txtappre);
        appreciation = (TextView) findViewById(R.id.apre);
        valider = (Button) findViewById(R.id.btnval);
        recommencer = (Button) findViewById(R.id.btnreco);



        //Recuperation de la note et le nbr de question passer au niveau de la page jeux...
        Intent intent = getIntent();
        if (intent != null) {
            int note = 0;
            int quoficient = 0;
            String pageCharger = null;
            if (intent.hasExtra("note")) {
                note = intent.getIntExtra("note", 0);
            }
            if (intent.hasExtra("quoficient")) {
                quoficient = intent.getIntExtra("quoficient", 0);
            }
            if (intent.hasExtra("pageCharger")) {
                pageCharger = intent.getStringExtra("pageCharger");
            }
            pageChargerCopi = pageCharger;

            //Affichage des donnees...
            txtnote.setText(String.valueOf(note));
            txtnote.setTextColor(Color.parseColor("#ff99cc00"));
            txtresult.setText(String.valueOf(note + "/" + String.valueOf(quoficient)));
            if (Integer.valueOf(note) < Integer.valueOf(quoficient) / 2) {
                appreciation.setBackgroundColor(Color.parseColor("#ffcc0000"));
                txtappre.setText("Désoler votre note est inferieure a la moyenne demander" +
                        ". Veillez rependre la série de questions avant de pouvoir valider. ");
                valider.setEnabled(false);
                valider.setVisibility(View.INVISIBLE);
            } else if (Integer.valueOf(note) > Integer.valueOf(quoficient) / 2 && Integer.valueOf(note) < Integer.valueOf(quoficient)
            ) {
                appreciation.setBackgroundColor(Color.parseColor("#ff99cc00"));
                txtappre.setText("Bien votre est note superieure a la moyenne demander" +
                        ". Vous pouvez valider, mais on vous recommande de reprendre afin de tout " +
                        " trouver.");

            } else if (Integer.valueOf(note) == Integer.valueOf(quoficient) / 2) {
                appreciation.setBackgroundColor(Color.parseColor("#ff99cc00"));
                txtappre.setText("Passable ! vous avez juste  la moyenne demander" +
                        ". Vous pouvez valider, mais on vous recommande de reprendre afin de tout " +
                        " trouver.");

            }
            else {
                appreciation.setBackgroundColor(Color.parseColor("#ff99cc00"));
                txtappre.setText("FELICITATION !!! Vous avez tout trouver .");
                recommencer.setEnabled(false);
                recommencer.setVisibility(View.INVISIBLE);

            }
        }

    }

    public void recommence(View view) {
        Intent pagejeux = new Intent(getApplicationContext(), ACTION.class);
        pagejeux.putExtra("PageCharger", pageChargerCopi);
        startActivity(pagejeux);
        finish();
    }

    public void acceuil(View view) {
        Intent acceuil = new Intent(getApplicationContext(), ACCEUILLE.class);
        startActivity(acceuil);
        finish();
    }
}