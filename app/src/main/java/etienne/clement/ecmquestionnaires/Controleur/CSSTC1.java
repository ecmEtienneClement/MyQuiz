package etienne.clement.ecmquestionnaires.Controleur;

import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.Questions;
import etienne.clement.ecmquestionnaires.Model.Reponses;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/18/21.
 */
public class CSSTC1 extends ControleurMere {

    public static CSSTC1 sCSSTC1 = null;
    public int note = 0;

    private CSSTC1() {
        super();
    }

    public static final CSSTC1 getCSSTC1() {
        if (CSSTC1.sCSSTC1 == null) {
            CSSTC1.sCSSTC1 = new CSSTC1();
        }
        return sCSSTC1;
    }

    //	Mise en place des differentes questions....

    Questions premiere_question = new Questions("A quoi sert le langage CSS ?");
    Questions deuxieme_question = new Questions("Où est-il conseillé de placer le code CSS ?");
    Questions troisieme_question = new Questions("Quel élément sépare la propriété de sa valeur ?");
    Questions quatrieme_question = new Questions("Dans quoi définit-on les déclarations CSS ?");
    Questions cinquieme_question = new Questions(
            "Dans la règle suivante, quel élément deviendra rouge ? strong#intro {background-color: red;}");
    Questions sixieme_question = new Questions(
            "Comment faire pour qu'une div prenne toute la largeur disponible dans son bloc conteneur ?");
    Questions septieme_question = new Questions("Comment déclarer une puce image au mieux ?");
    Questions huitieme_question = new Questions(
            "Comment peut-on figer la taille des caractères pour être sûr d'avoir exactement le même rendu partout ?");
    Questions neuvieme_question = new Questions(
            "Si j'écris a:active {color: red;} dans ma feuille de style, quels liens seront de couleur rouge ?");
    Questions dixieme_question = new Questions("A quoi sert le sélecteur de classe : h2.nomDeClasse ?");

    // Mise en place des differentes des reponses...

    Reponses premiere_reponse = new Reponses("A réaliser des pages dynamiques", "A ajouter du style aux documents web ",
            "A insérer du contenu dans une page internet", 2);
    Reponses deuxieme_reponse = new Reponses("Dans un fichier externe utilisable pour plusieurs pages",
            "Entre les balises <head>, c'est bien plus propre", "Dans le <body>", 1);
    Reponses troisieme_reponse = new Reponses("Le signe égal (=)", "Le signe deux points (:) ", "Le signe espace ( )",
            2);
    Reponses quatrieme_reponse = new Reponses(" Entre deux accolades séparés par des points-virgules { ... ; ... }",
            "Entre deux crochets sépareés par des tirets [ ... - ... ]",
            "Entre deux guillemets séparées par des slashs \" ... / ... \"", 1);
    Reponses cinquieme_reponse = new Reponses(
            "L'élément dont l'id est \"intro\" et qui est contenu dans un élément <strong>",
            "L'élément <strong> dont l'id est \"intro\" ",
            "Tous les éléments <strong> contenus dans un élément dont l'id est \"intro\"", 2);
    Reponses sixieme_reponse = new Reponses("div {width: 80%; padding: 10%;}", "div {width: 100%; padding: 10%;}",
            "div {min-width: 100%;}", " C'est automatique, pas besoin de spécifier une largeur ", 4);
    Reponses septieme_reponse = new Reponses("li {list-style-image: url(image.png);}", "li {image: url(image.png);} ",
            "li {list-style-type: disc; list-style-image: url(image.png);} ", "li {list-style: url(image.png);}", 3);
    Reponses huitieme_reponse = new Reponses("Avec des tailles de police en pixels ou en points",
            "En précisant des tailles de police en pixels (ex : font-size: 12px).",
            "En précisant des tailles de police en EM (ex : font-size: 0.8em). ",
            "On ne peut pas figer la taille des caractères pour être sûr d'avoir exactement le même rendu partout. C'est impossible.  ",
            4);
    Reponses neuvieme_reponse = new Reponses(
            "n'importe quel lien de la page, mais uniquement au moment où on survole ce lien avec le pointeur de la souris",
            "les liens pointant vers la page en cours (par exemple dans un menu de navigation)",
            "les liens pointant vers des pages mises à jour régulièrement",
            "n'importe quel lien de la page, mais uniquement au moment où on clique sur ce lien ", 4);
    Reponses dixieme_reponse = new Reponses(
            "A définir différentes propriétés pour l'élément <h2> dont la classe est \"nomDeClasse\" ",
            "Ah bon ... C'est censé servir à quelque chose ? ", "  A créer une ancre sur la balise <h2>\n", 1);


    //Mise en place de mon tableau de questions...

    public Questions tableau_questions[] = {premiere_question, deuxieme_question, troisieme_question, quatrieme_question,
            cinquieme_question, sixieme_question, septieme_question, huitieme_question, neuvieme_question,
            dixieme_question};

    //Mise en placde de mon tableau de reponses...

    public Reponses tableau_reponses[] = {premiere_reponse, deuxieme_reponse, troisieme_reponse, quatrieme_reponse,
            cinquieme_reponse, sixieme_reponse, septieme_reponse, huitieme_reponse, neuvieme_reponse, dixieme_reponse};

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
