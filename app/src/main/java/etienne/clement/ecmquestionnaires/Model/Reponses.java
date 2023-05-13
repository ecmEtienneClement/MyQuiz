package etienne.clement.ecmquestionnaires.Model;

/**
 * created by ETIENNE CLEMENT MBAYE on 1/11/21.
 */
public class Reponses {

    private String reponse1;
    private String reponse2;
    private String reponse3;
    private String reponse4;
    private String reponse5;
    private int bonneReponse;
    private int jePasse;

    /***
     *
     * @param reponse1
     * @param reponse2
     * @param reponse3
     * @param reponse4
     * @param reponse5
     * @param bonneReponse

     */
    public Reponses(String reponse1,String reponse2,String reponse3,String reponse4,String reponse5,int bonneReponse) {
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.reponse3 = reponse3;
        this.reponse4 = reponse4;
        this.reponse5 = reponse5;
        this.bonneReponse = bonneReponse;


    }
    //Je surcharge ma methode pour ceux des quatre questions...
    public Reponses(String reponse1,String reponse2,String reponse3,String reponse4,int bonneReponse) {
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.reponse3 = reponse3;
        this.reponse4 = reponse4;
        this.bonneReponse = bonneReponse;

    }
    //Je surcharge ma methode pour ceux des trois questions...
    public Reponses(String reponse1,String reponse2,String reponse3,int bonneReponse) {
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.reponse3 = reponse3;
        this.bonneReponse = bonneReponse;

    }
    //Je surcharge ma methode pour ceux des deux questions...
    public Reponses(String reponse1,String reponse2,int bonneReponse) {
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.bonneReponse = bonneReponse;

    }
    /**
     * @return the reponse1
     */
    public String getReponse1() {
        return reponse1;
    }

    /**
     * @return the reponse2
     */
    public String getReponse2() {
        return reponse2;
    }

    /**
     * @return the reponse3
     */
    public String getReponse3() {
        return reponse3;
    }

    /**
     * @return the reponse4
     */
    public String getReponse4() {
        return reponse4;
    }
    public String getReponse5() {
        return reponse5;
    }

    /**
     * @return the bonneReponse
     */
    public int getBonneReponse() {
        return bonneReponse;
    }

}
