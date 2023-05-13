package etienne.clement.ecmquestionnaires.Controleur;
import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.Reponses;
import  etienne.clement.ecmquestionnaires.Model.Questions;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/14/21.
 */
public class JSTC4 extends ControleurMere {

    public static JSTC4 sJSTC4 = null;
    public int note = 0;

    public JSTC4() {
        super();
    }
    public static JSTC4 getJSTC4(){
        if(JSTC4.sJSTC4==null){
            JSTC4.sJSTC4= new JSTC4();
        }
        return  sJSTC4;
    }


    Questions premiere_question = new Questions("L'API du DOM permet :?");
    Questions deuxieme_question = new Questions("La méthode getElementByid(); prend en paramètre ?");
    Questions troisieme_question = new Questions("La classe node définit différentes propriétés afin de donner accés aux informations"
            + " relative au nœud telles que son type est son nom :");
    Questions quatrieme_question = new Questions("La méthode getElementByTagName(); renvoie?");
    Questions cinquieme_question = new Questions("La méthode getElementByTagName();prend en paramtre ?");
    Questions sixieme_question = new Questions("var ecm = getElementByid(\"etienne\");\nvar clement = ecm.firstChild ;");
    Questions septieme_question = new Questions("Quelle est la méthode permettant de supprimer l'attribut d'un élément ");
    Questions huitieme_question = new Questions("Quelle attribut permet de remplacer complètement le contenu d'un élément HTML ?");
    Questions neuvieme_question = new Questions("Quelle attribut de la classe Node permet de réferencer le nœud parent d'un élément ?");
    Questions dixieme_question = new Questions("Quelle méthode permet d'ajouter un nœud dans une page ?");

    //Mise en place des differentes des reponses...

    Reponses premiere_reponse = new Reponses("la mise en forme d'une page","d'accéder à une page web et de manipuler son contenu sa structure ainsi que ces styles" ,
            "d'accéder à une page web et de manipuler seulement son contenu",2);
    Reponses deuxieme_reponse = new Reponses("le nom d'une balise","l'identifiant d'un nœud","le nom du nœud",2);
    Reponses troisieme_reponse = new Reponses("Vrai","Faux",1);
    Reponses quatrieme_reponse = new Reponses("un seul nœud","des attributs de nœuds","une liste de nœuds",3);
    Reponses cinquieme_reponse = new Reponses("l'identifiant d'un nœud","le nom d'une balise","le nom d'une classe",2);
    Reponses sixieme_reponse = new Reponses("le nom du dernier nœud","le dernier nœud","le premier nœud",2);
    Reponses septieme_reponse = new Reponses("deleteAttribute()","dropAttribute()","remove attribute()",3);
    Reponses huitieme_reponse = new Reponses("innerHTML","replaceAttribute","changeAttribute",1);
    Reponses neuvieme_reponse = new Reponses("parentNode()","firstNode()",1);
    Reponses dixieme_reponse = new Reponses("appendChild()","addNode()","getChild()",1);


    //Mise en place de mon tableau de questions...

   public Questions tableau_questions[]= {premiere_question,deuxieme_question,troisieme_question,quatrieme_question,
            cinquieme_question,sixieme_question,septieme_question,huitieme_question,neuvieme_question,
            dixieme_question};

    //Mise en placde de mon tableau de reponses...

    public Reponses tableau_reponses[]= {premiere_reponse,deuxieme_reponse,troisieme_reponse,quatrieme_reponse,
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
