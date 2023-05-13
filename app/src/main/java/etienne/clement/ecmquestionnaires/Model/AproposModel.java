package etienne.clement.ecmquestionnaires.Model;

import android.widget.Button;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/22/21.
 */
public class AproposModel {

   public String titre;
   public String corps;
    /**
     *
     * @param titre
     * @param corps
     */
    public AproposModel(String titre, String corps) {
        this.titre = titre;
        this.corps = corps;
    }

    public String getTitre() {
        return titre;
    }

    public String getCorps() {
        return corps;
    }
}
