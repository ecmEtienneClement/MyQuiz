package etienne.clement.ecmquestionnaires.Controleur;
import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.Reponses;
import etienne.clement.ecmquestionnaires.Model.Questions;
/**
 * created by ETIENNE CLEMENT MBAYE on 2/14/21.
 */
public class XMLTC1 extends ControleurMere{
    public static XMLTC1 sXMLTC1 = null;
  public int note = 0;
    public XMLTC1() {
        super();

    }
    public static XMLTC1 getXMLTC1(){
        if (XMLTC1.sXMLTC1==null){
            XMLTC1.sXMLTC1 = new XMLTC1();
        }
        return sXMLTC1;
    }
    //Mise en place de mes questions
    Questions premiere_question = new Questions("Comment fonctionne le processeur XML à la rencontre d'une balise de début ?");
    Questions deuxieme_question = new Questions("Comment fonctionne le processeur XML à la rencontre d'une balise de fin correspondante ?");
    Questions troisieme_question = new Questions("Dans la balise suivante, <date year =\"2015\" day=\"10\" month=\"10\"/> que represente \"year\" ?");
    Questions quatrieme_question = new Questions("Laquelle des réponses est fausse ?");
    Questions cinquieme_question = new Questions("Les balises sont encadrées par les signes ?");
    Questions sixieme_question = new Questions("Les balises suivantes sont-elles bien fermées \n<mail><to>Etudiants</mail></to> ?");
    Questions septieme_question = new Questions("Par quoi commence un document XML correct ?");
    Questions huitieme_question = new Questions("Par quoi doivent être encadrées les valeurs associées aux attributs ?");
    Questions neuvieme_question = new Questions("Quand parle t-on de structure arborescente ?");
    Questions dixieme_question = new Questions("Que signifie XML ?");
    Questions onzieme_question = new Questions("Un document XML bien formé doit ?");
    Questions douzieme_question = new Questions("Un document XML doit avoir combien de racines ?");
    Questions treizieme_question = new Questions("Un document XML peut-il être éxécuté sur un navigateur web ?");
    Questions quatorzieme_question = new Questions("Entre une balise de début et une balise de fin, on peut trouver du texte?");
    Questions quinzieme_question = new Questions("Il existe dans un document XML des balises de début et des balises de fin ?");
    Questions siezieme_question = new Questions("Le rôle des processeurs est de vérifier que des documents XML sont mal formés ?");
    Questions dixseptieme_question = new Questions("Les balises peuvent être imbriquées ?");
    Questions dixhuiteme_question = new Questions("Peut-on mettre n'importe quel mot dans une balise ?");
    Questions dixnevieme_question = new Questions("Un document XML ne doit pas être bien formé ?");
    Questions vaingtieme_question = new Questions("XML est défini comme un langage de balises sémantiques ?");
    //Mise en place des differentes des reponses...

    Reponses premiere_reponse = new Reponses("Entrer dans l'état de traitement de cette balise","Signaler une erreur","Sortir de cet état",1);
    Reponses deuxieme_reponse = new Reponses("Entrer dans l'état de traitement de cette balise","Sortir dans cet état et revenir à l'état précédent","Signaler une erreur",2);
    Reponses troisieme_reponse = new Reponses("Une fonction","non signifiant","Un attribut",3);
    Reponses quatrieme_reponse = new Reponses("<etudiant><prenom>Toto</prenom><nom>Toto</nom></etudiant>","aucune","<etudiant prenom:\"Toto\" nom:\"NomToto\"/>",2);
    Reponses cinquieme_reponse = new Reponses("< >","?","!",1);
    Reponses sixieme_reponse = new Reponses("pas signifiant","non","oui",2);
    Reponses septieme_reponse = new Reponses("?xml version=\"1.0\"?","<?xml version=\"1.0\"?>","<xml version=\"1.0\"?>","<xml version=\"1.0\"?",2);
    Reponses huitieme_reponse = new Reponses("des guillemets","des points d'exclamation","des points d'interrogation",1);
    Reponses neuvieme_reponse = new Reponses("lorsque des éléments sont imbriqués dans d'autres éléments","lorsque qu'on a des attributs","lorsque les balises ne sont pas fermées",1);
    Reponses dixieme_reponse = new Reponses("Extensible Modeling Language","extensible Markup Language","HyperText Markup Language",2);
    Reponses onzieme_reponse = new Reponses("obéir à la spécification XML","répondre aux besoins de l'utilisateur",1);
    Reponses douzieme_reponse = new Reponses("plusieurs","un et un seul","un ou plusieurs",2);
    Reponses treizieme_reponse = new Reponses("non","oui",2);
    Reponses quatorzieme_reponse = new Reponses("oui","non",1);
    Reponses quinzieme_reponse = new Reponses("oui","non",1);
    Reponses siezieme_reponse = new Reponses("oui","non",2);
    Reponses dixseptieme_reponse = new Reponses("oui","non",1);
    Reponses dixhuiteme_reponse = new Reponses("oui","non",1);
    Reponses dixnevieme_reponse = new Reponses("oui","non",2);
    Reponses vaingtieme_reponse = new Reponses("oui","non",1);


   public Questions tableau_questions[]= {
            premiere_question,deuxieme_question,troisieme_question,quatrieme_question,
            cinquieme_question,sixieme_question,septieme_question,huitieme_question,neuvieme_question,
            dixieme_question,onzieme_question,douzieme_question,treizieme_question,quatorzieme_question,
            quinzieme_question,siezieme_question,dixseptieme_question,dixhuiteme_question,dixnevieme_question,
            vaingtieme_question
    };



   public Reponses tableau_reponses[]= {premiere_reponse,deuxieme_reponse,troisieme_reponse,quatrieme_reponse,
            cinquieme_reponse,sixieme_reponse,septieme_reponse,huitieme_reponse,neuvieme_reponse,dixieme_reponse,
            onzieme_reponse,douzieme_reponse,treizieme_reponse,quatorzieme_reponse,quinzieme_reponse,
            siezieme_reponse,dixseptieme_reponse,dixhuiteme_reponse,dixnevieme_reponse,vaingtieme_reponse};

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
