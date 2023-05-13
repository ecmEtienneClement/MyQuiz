package etienne.clement.ecmquestionnaires.Controleur;
import android.content.Context;
import android.view.View;

import etienne.clement.ecmquestionnaires.Model.*;




/**
 * created by ETIENNE CLEMENT MBAYE on 2/20/21.
 */
public class ALGOTC1 extends ControleurMere {
    public static ALGOTC1 sALGOTC1 = null;
    public int note = 0;

    private ALGOTC1() {
        super();
    }
    public static ALGOTC1 getALGOTC1(){
        if (ALGOTC1.sALGOTC1 == null){
            ALGOTC1.sALGOTC1 = new ALGOTC1();
        }
        return sALGOTC1;
    }
   // Mise en place de mes questions
    Questions premiere_question = new Questions("Pour communiquer les résultats, on effectue : ?");
    Questions deuxieme_question = new Questions("L'écriture 3 Ko indique un espace mémoire de : ?");
    Questions troisieme_question = new Questions("La plus petite quantité d'information s'appelle :?");
    Questions quatrieme_question = new Questions("Une suite de 8 bits s'appelle : ?");
    Questions cinquieme_question = new Questions("Le clavier est un organe :?");
    Questions sixieme_question = new Questions("L'informatique est :?");
    Questions septieme_question = new Questions("Le système d'exploitation Windows appartient à :?");
    Questions huitieme_question = new Questions("La mémoire RAM est : ?");
    Questions neuvieme_question = new Questions("Pour utiliser un programme, il faut le charger : ?");
    Questions dixieme_question = new Questions("Pour réaliser un traitement, l'ordinateur exécute : ?");
    Questions onzieme_question = new Questions(
            "Actuellement, la capacité d'un disque dur s'exprime généralement en :?");
    Questions douzieme_question = new Questions(
            "Dans le micro-ordinateur le traitement de l'information est réalisé par :?");
    Questions treizieme_question = new Questions("Pour sauver les informations de manière permanente, j'utilise :?");
    Questions quatorzieme_question = new Questions("Un ensemble de 32 bits correspond à :?");
    // ..........

    Reponses premiere_reponse = new Reponses("une écriture ", "une lecture", " un traitement numérique", 1);
    Reponses deuxieme_reponse = new Reponses("3000 bits", "  3072 octets ", "3000 octets", 2);
    Reponses troisieme_reponse = new Reponses(" l'octet ", "le bit ", " le mot", 2);
    Reponses quatrieme_reponse = new Reponses("un bit", "un octet ", "un quartet ", 2);
    Reponses cinquieme_reponse = new Reponses("de sortie", " d'entrée ", " d'entrée/sortie", 2);
    Reponses sixieme_reponse = new Reponses("un ordinateur ", "la science du traitement des connaissances",
            "la science du traitement rationnel de l'information", 3);
    Reponses septieme_reponse = new Reponses("Apple", "IBM", "Microsoft ", 3);
    Reponses huitieme_reponse = new Reponses("non volatile", "souple", "volatile ", 3);
    Reponses neuvieme_reponse = new Reponses("sur disquette", " en mémoire RAM  ", "sur l'écran", 2);
    Reponses dixieme_reponse = new Reponses("un programme ", " des données", "des résultats ", 1);
    Reponses onzieme_reponse = new Reponses("gigaoctet (Go) ", "kilo-octet (Ko)", "octets ", 1);
    Reponses douzieme_reponse = new Reponses(" la mémoire RAM", "la mémoire ROM ", " le microprocesseur ", 3);
    Reponses treizieme_reponse = new Reponses("un disque dur ", " la souris", "  la carte mère", 1);
    Reponses quatorzieme_reponse = new Reponses("32 octets", "4 octets ", "32 mots", 2);
    //...................
    public Questions tableau_questions[] = { premiere_question, deuxieme_question, troisieme_question, quatrieme_question,
            cinquieme_question, sixieme_question, septieme_question, huitieme_question, neuvieme_question,
            dixieme_question, onzieme_question, douzieme_question, treizieme_question, quatorzieme_question,

    };

    public Reponses tableau_reponses[] = { premiere_reponse, deuxieme_reponse, troisieme_reponse, quatrieme_reponse,
            cinquieme_reponse, sixieme_reponse, septieme_reponse, huitieme_reponse, neuvieme_reponse, dixieme_reponse,
            onzieme_reponse, douzieme_reponse, treizieme_reponse, quatorzieme_reponse };

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
