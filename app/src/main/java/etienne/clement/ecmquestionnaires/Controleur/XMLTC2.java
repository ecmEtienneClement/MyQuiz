package etienne.clement.ecmquestionnaires.Controleur;

import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.Questions;
import etienne.clement.ecmquestionnaires.Model.Reponses;


/**
 * created by ETIENNE CLEMENT MBAYE on 2/19/21.
 */
public final class XMLTC2 extends ControleurMere {
    public static XMLTC2 sXMLTC2 = null;
    public int note = 0;

    private XMLTC2() {
        super();
    }

    public static final XMLTC2 getXMLTC2() {
        if (XMLTC2.sXMLTC2 == null) {
            XMLTC2.sXMLTC2 = new XMLTC2();
        }
        return sXMLTC2;
    }


    // Mise en place de mes questions
    Questions premiere_question = new Questions("Comment appelle t-on les entités déclarées dans une DTD ?");
    Questions deuxieme_question = new Questions("Comment déclare t-on une liste d'attributs dans une DTD ?");
    Questions troisieme_question = new Questions("Comment fonctionne un processeur validateur ?");
    Questions quatrieme_question = new Questions("DOCTYPE est utilisé pour: ?");
    Questions cinquieme_question = new Questions(" Le rôle de l'attribut \"encoding\" est:?");
    Questions sixieme_question = new Questions("Le rôle de la déclaration de type de document est de :?");
    Questions septieme_question = new Questions("Peut-on déclarer une liste d'attributs dans une DTD ?");
    Questions huitieme_question = new Questions("Qu'est ce qu'une DTD externe ?");
    Questions neuvieme_question = new Questions("Qu'est ce qu'une entité ?");
    Questions dixieme_question = new Questions("Qu'est ce que les entités générales?");
    Questions onzieme_question = new Questions(
            "Qu'est ce qui est utilisé pour montrer qu'une valeur est obligatoire ?");
    Questions douzieme_question = new Questions(
            "Qu'est ce qui permet de définir la liste des attributs pour une balise ?");
    Questions treizieme_question = new Questions(
            "Que fait l'instruction suivante ? <? xml-stylesheet type=\"text/css\" href=\"styl?");
    Questions quatorzieme_question = new Questions("Quand parle t-on de modèle mixte dans une DTD ?");
    // ..........

    Reponses premiere_reponse = new Reponses("des attributs", "des paramètres", " des fonctions", 2);
    Reponses deuxieme_reponse = new Reponses("<!ATTLIST Nom_element nom_attribut type_attribut defaut>",
            " <!ATTLIST Nom_element nom_attribut type_element defaut>",
            "<!ATTLIST Nom_attribut nom_element type_element defaut>", 1);
    Reponses troisieme_reponse = new Reponses(" lit la DTD avant de lire le document XML ",
            "lit le document XML avant de lire la DTD", "il lit les attributs et les regroupe", 1);
    Reponses quatrieme_reponse = new Reponses("déclarer une balise imbriquée", "définir les valeurs d'un attribut",
            "déclarer une DTD ", 3);
    Reponses cinquieme_reponse = new Reponses("de créer des attributs dans le document XML",
            " d'indiquer le type de codage que doivent utiliser les processeurs XML",
            " transformer des caractres UNicode en données binaires pour le transport", 2);
    Reponses sixieme_reponse = new Reponses("référencer et ou définir localement des entités ",
            "pouvoir exécuter le document XML avec un nvigateur web", "vérifier si une page web est correcte", 1);
    Reponses septieme_reponse = new Reponses("Non", "Oui", 2);
    Reponses huitieme_reponse = new Reponses("les déclarations de la DTD sont placées apres la déclaration XML",
            "les déclarations de la DTD sont placées hors du DOCTYPE",
            "les déclarations sont placées dans un fichier externe ", 3);
    Reponses neuvieme_reponse = new Reponses("un ensemble de DTD",
            " assemblage de plusieurs unités physiques existant séparément ",
            "assemblage de plusieurs attributs dans un fichier XML", 2);
    Reponses dixieme_reponse = new Reponses("des entités appelés à la fin d'un d'une DTD",
            " des entités appelés dans le corps d'une DTD", "des entités appelés dans le corps d'un document ", 3);
    Reponses onzieme_reponse = new Reponses("fixed", "implied", " requiered ", 3);
    Reponses douzieme_reponse = new Reponses(" IMPLIED", "ATTLIST ", " CDATA", 2);
    Reponses treizieme_reponse = new Reponses("afficher les données XML en appliquant la feuille de style \"style.css ",
            "supprimer toutes les données XML", " supprimer la feuille de style \"style.css\"", 1);
    Reponses quatorzieme_reponse = new Reponses("quand l'élément contient des données et des éléments",
            "quand l'élément contient juste des images", "quand l'élément contient juste des données", 1);

    //...................
    public Questions tableau_questions[] = {premiere_question, deuxieme_question, troisieme_question, quatrieme_question,
            cinquieme_question, sixieme_question, septieme_question, huitieme_question, neuvieme_question,
            dixieme_question, onzieme_question, douzieme_question, treizieme_question, quatorzieme_question,

    };

    public Reponses tableau_reponses[] = {premiere_reponse, deuxieme_reponse, troisieme_reponse, quatrieme_reponse,
            cinquieme_reponse, sixieme_reponse, septieme_reponse, huitieme_reponse, neuvieme_reponse, dixieme_reponse,
            onzieme_reponse, douzieme_reponse, treizieme_reponse, quatorzieme_reponse};

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
