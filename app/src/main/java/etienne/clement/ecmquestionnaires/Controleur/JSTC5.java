package etienne.clement.ecmquestionnaires.Controleur;
import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.Questions;
import etienne.clement.ecmquestionnaires.Model.Reponses;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/14/21.
 */
public final class JSTC5 extends ControleurMere{
    public static JSTC5 sJSTC5 = null;
    public int note = 0;
    public JSTC5() {
        super();
    }
    public static JSTC5 getJSTC5(){
        if(JSTC5.sJSTC5==null){
            JSTC5.sJSTC5= new JSTC5();
        }
        return sJSTC5;
    }


    Questions premiere_question = new Questions("Choisir la bonne expression:?");
    Questions deuxieme_question = new Questions("Quel type d'évènement correspond au clique de la souris par l'utilisateur ?");
    Questions troisieme_question = new Questions("Un observateur d'événement est:");
    Questions quatrieme_question = new Questions("La classe mouseEvent est une classe fille de ?");
    Questions cinquieme_question = new Questions("La méthode preventDefault() permet ?");
    Questions sixieme_question = new Questions("Quelle méthode permet d'enregistrer un observateur d'événement ?");
    Questions septieme_question = new Questions("Un événement  de type Load se produit lorsque ?");
    Questions huitieme_question = new Questions("Quelle est le type d'événement lors de la validation d'un formulaire ?");
    Questions neuvieme_question = new Questions("Choisir la bonne syntaxe ?");
    Questions dixieme_question = new Questions("Un événement de type reset se produit lorsque l'utilisateur réinitialise un formulaire ?");

    //Mise en place des differentes des reponses...

    Reponses premiere_reponse = new Reponses("<a href=\"http://www.uvs.sn\"onClick=\"alert('vous avez cliqué!');\"",
            "<a href=\"http://www.uvs.sn\"\"alert('vous avez cliqué!');\"" ,
            "<a href=\"http://www.uvs.sn\" action=\"alert('vous avez cliqué!');\"",1);
    Reponses deuxieme_reponse = new Reponses("mouseclick","mousemove","onclick",3);
    Reponses troisieme_reponse = new Reponses("Une fonction","Un attribut","Une classe",1);
    Reponses quatrieme_reponse = new Reponses("Event","Mouse","MouseAdapter",1);
    Reponses cinquieme_reponse = new Reponses("D'ajouter un évènement","De modifier un évènement","De supprimer un évènement",3);
    Reponses sixieme_reponse = new Reponses("appendEvent();","addEventListener();","addEvent();",2);
    Reponses septieme_reponse = new Reponses("Une page web a été chargée complètement","L'utilisateur a cliqué sur un élément","Lorsque l'utilisateur tape sur le clavier ",1);
    Reponses huitieme_reponse = new Reponses("submit","send","validate",1);
    Reponses neuvieme_reponse = new Reponses("monNœud.addEventListener(\"click\",traitementEvenement,false);","monNœud.addListener(\"click\",traitementEvenement,false);",
            "monNœud.addEventListener(\"clicker\",traitementEvenement,false);",1);
    Reponses dixieme_reponse = new Reponses("Vrai","Faux",1);


    //Mise en place de mon tableau de questions...

    public Questions tableau_questions[]= {premiere_question,deuxieme_question,troisieme_question,quatrieme_question,
            cinquieme_question,sixieme_question,septieme_question,huitieme_question,neuvieme_question,
            dixieme_question};

    //Mise en placde de mon tableau de reponses...

  public   Reponses tableau_reponses[]= {premiere_reponse,deuxieme_reponse,troisieme_reponse,quatrieme_reponse,
            cinquieme_reponse,sixieme_reponse,septieme_reponse,huitieme_reponse,neuvieme_reponse,dixieme_reponse};

    public int VerificationResultat(int a, int reponse, Context context, View view) {
        /*Cette methode appelle la methode de la classe mere pour la verfification des resultats
         * la methode de la classe fille appelle celle de la classe mere en la passant les parametres
         * a-reponse-tableau_reponse( qui est sur cette classe)-context-et view
         * Mais l'appelle de cette methode de la classe fille dans la classe action la passera les memes
         * parametres sauf le tableau_reponses qui cette parametre est deja passer par la classse fille */
        note = super.VerificationResultat(a, reponse, tableau_reponses, context, view);
        /*la note est renvoyer par la classe mere 1 ou 0 qui stoker ds la variable note de la
         * classe fille qui ensuit est renvoyer dans la classe action qui est aussi stoker ds une
         * variable note */
        return note;
    }
}
