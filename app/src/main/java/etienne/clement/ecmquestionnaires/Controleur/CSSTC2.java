package etienne.clement.ecmquestionnaires.Controleur;

import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.Reponses;
import etienne.clement.ecmquestionnaires.Model.Questions;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/19/21.
 */
public final class CSSTC2 extends ControleurMere {
    public static CSSTC2 sCSSTC2 = null;
    public int note = 0;

    private CSSTC2() {
        super();
    }

    public static final CSSTC2 getCSSTC2() {
        if (CSSTC2.sCSSTC2 == null) {
            CSSTC2.sCSSTC2 = new CSSTC2();
        }
        return sCSSTC2;
    }

//	Mise en place des differentes questions....

    Questions premiere_question = new Questions("A quoi sert le sélecteur CSS3 \"h1 ~ p\", reconnu depuis IE7 ?");
    Questions deuxieme_question = new Questions("Comment cibler les 4 premiers éléments d'une liste ?");
    Questions troisieme_question = new Questions(
            "Comment cibler tous les liens de la page sauf ceux qui contiennent la chaîne \"camarade\" ?");
    Questions quatrieme_question = new Questions(
            "Comment charger une feuille de style uniquement pour une fenêtre au format paysage ?");
    Questions cinquieme_question = new Questions(" La propriété CSS p.ville {display :block}");
    Questions sixieme_question = new Questions(
            "Quel attribut de la balise <link> lie une feuille de style adaptées à l'écran d'un smartphone ?");
    Questions septieme_question = new Questions(
            "Que doit-on écrire en CSS pour appliquer un style aux balises de titre de niveau 2 et 3 ?");
    Questions huitieme_question = new Questions(
            " Lequel de ces alignements fait prendre au texte toute la largeur disponible ?");

    // Mise en place des differentes des reponses...

    Reponses premiere_reponse = new Reponses("à cibler les éléments h1 s'ils contiennent un paragraphe ",
            "à cibler tantôt un titre h1, tantôt un paragraphe", " à cibler tous les titres et paragraphes de la page",
            "A quoi sert le sélecteur CSS3 \"h1 ~ p\", reconnu depuis IE7 ?", 4);
    Reponses deuxieme_reponse = new Reponses("li:nth-child(4n)", "li:nth-child(substr(4))", "li:nth-child(-n+4)  ",
            "li:nth-child(4-n)", 3);
    Reponses troisieme_reponse = new Reponses("a[href!=\"camarade\"]", "a:not([href*=\"camarade\"]) ",
            "a![href*=\" camarade\"]", " a![href$=\" camarade\"] ", 2);
    Reponses quatrieme_reponse = new Reponses("<link rel=\"stylesheet\" size=\"landscape\" href=\"styles.css\"> ",
            "<link rel=\"stylesheet\" media=\"screen\" size=\"landscape\" href=\"styles.css\">",
            "<link rel=\"stylesheet\" media=\"(orientation : landscape)\" href=\"styles.css\">  ",
            "link rel=\"stylesheet\" media=\"landscape\" href=\"styles.css\">", 3);
    Reponses cinquieme_reponse = new Reponses(" Bloque le défilement de \"p.ville\"",
            "Bloque l’affichage de \"p.ville\"", "Affiche le bloc \"p.ville\"",
            "Modifie le type de l’élément \"p.ville\" en bloc", 4);
    Reponses sixieme_reponse = new Reponses("media=\"small\"", "media=\"handheld\"", " media=\"smart\"",
            "media=\"mobile\"", 2);
    Reponses septieme_reponse = new Reponses(" h2, h3 ", " h2 + h3", " h2 h3", ".h2 .h3", 1);
    Reponses huitieme_reponse = new Reponses("right", "center", "left", "justify ", 4);

    // Mise en place de mon tableau de questions...

    public Questions tableau_questions[] = {premiere_question, deuxieme_question, troisieme_question, quatrieme_question,
            cinquieme_question, sixieme_question, septieme_question, huitieme_question,};

    // Mise en placde de mon tableau de reponses...

    public Reponses tableau_reponses[] = {premiere_reponse, deuxieme_reponse, troisieme_reponse, quatrieme_reponse,
            cinquieme_reponse, sixieme_reponse, septieme_reponse, huitieme_reponse};

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
