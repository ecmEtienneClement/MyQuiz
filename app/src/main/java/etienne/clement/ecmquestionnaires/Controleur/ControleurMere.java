package etienne.clement.ecmquestionnaires.Controleur;

import android.content.Context;
import android.graphics.Color;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

import etienne.clement.ecmquestionnaires.Model.Questions;
import etienne.clement.ecmquestionnaires.Model.Reponses;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/8/21.
 */
public class ControleurMere {
    /*MA METHODE DE VERIFICATION DES RESULTATS QUI TOUT LES CLASSES VONT HERITEES*/

    public int VerificationResultat(int a, int reponse, Reponses tableau_reponses[], Context context, View view) {

        if (reponse == tableau_reponses[a].getBonneReponse()) {
            Toast feliciter = Toast.makeText(context, "Bravo !", Toast.LENGTH_SHORT);
            View feliciterView = feliciter.getView();
            TextView felicitertxt = (TextView) feliciterView.findViewById(android.R.id.message);
            felicitertxt.setTextSize(24);
            felicitertxt.setTextColor(Color.parseColor("#ff99cc00"));
            feliciter.show();
            return 1;
        } else {
            view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY, HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING);
            if (tableau_reponses[a].getBonneReponse() == 1) {
                Toast.makeText(context, tableau_reponses[a].getReponse1(), Toast.LENGTH_SHORT).show();
            } else if (tableau_reponses[a].getBonneReponse() == 2) {
                Toast.makeText(context, tableau_reponses[a].getReponse2(), Toast.LENGTH_SHORT).show();
            } else if (tableau_reponses[a].getBonneReponse() == 3) {
                Toast.makeText(context, tableau_reponses[a].getReponse3(), Toast.LENGTH_SHORT).show();
            } else if (tableau_reponses[a].getBonneReponse() == 4) {
                Toast.makeText(context, tableau_reponses[a].getReponse4(), Toast.LENGTH_SHORT).show();
            }
        }
        return 0;

    }

    public void generation(TextView question, Button btn1, Button btn2, Button btn3,
                           Button btn4, Button btn5, Questions tableau_questions[],
                           Reponses tableau_reponses[], int a) {

        question.setText(tableau_questions[a].getQuestion());
        //AFFICHAGE DES REPONSES SUR LES BOUTONS
        btn1.setText(tableau_reponses[a].getReponse1());
        btn2.setText(tableau_reponses[a].getReponse2());
        //DESACTIVATION DU BOUTON SI CE DERNIER NE CONTIENT PAS DE REPONSES
        if (tableau_reponses[a].getReponse3() == null) {
            btn3.setVisibility(View.INVISIBLE);
            btn3.setEnabled(false);
        }
        //ACTIVATION DU BOUTON SI IL CONTIENT UNE REPONSE
        else {
            btn3.setVisibility(View.VISIBLE);
            btn3.setEnabled(true);
            btn3.setText(tableau_reponses[a].getReponse3());
        }
        //DESACTIVATION DU BOUTON SI CE DERNIER NE CONTIENT PAS DE REPONSES
        if (tableau_reponses[a].getReponse4() == null) {
            btn4.setVisibility(View.INVISIBLE);
            btn4.setEnabled(false);
        } //ACTIVATION DU BOUTON SI IL CONTIENT UNE REPONSE
        else {
            btn4.setVisibility(View.VISIBLE);
            btn4.setEnabled(true);
            btn4.setText(tableau_reponses[a].getReponse4());
        }//DESACTIVATION DU BOUTON SI CE DERNIER NE CONTIENT PAS DE REPONSES
        if (tableau_reponses[a].getReponse5() == null) {
            btn5.setVisibility(View.INVISIBLE);
            btn5.setEnabled(false);
        } //ACTIVATION DU BOUTON SI IL CONTIENT UNE REPONSE
        else {
            btn5.setVisibility(View.VISIBLE);
            btn5.setEnabled(true);
            btn5.setText(tableau_reponses[a].getReponse5());
        }

    }
}
