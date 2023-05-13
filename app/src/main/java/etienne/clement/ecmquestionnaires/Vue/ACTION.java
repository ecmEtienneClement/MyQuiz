package etienne.clement.ecmquestionnaires.Vue;

import etienne.clement.ecmquestionnaires.Controleur.ALGOTC1;
import etienne.clement.ecmquestionnaires.Controleur.ALGOTC2;
import etienne.clement.ecmquestionnaires.Controleur.CSSTC1;
import etienne.clement.ecmquestionnaires.Controleur.CSSTC2;
import etienne.clement.ecmquestionnaires.Controleur.CTC1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Xml;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.TextView;

import etienne.clement.ecmquestionnaires.Controleur.CTC2;
import etienne.clement.ecmquestionnaires.Controleur.HTML5TC1;
import etienne.clement.ecmquestionnaires.Controleur.HTML5TC2;
import etienne.clement.ecmquestionnaires.Controleur.JSTC1;
import etienne.clement.ecmquestionnaires.Controleur.JSTC2;
import etienne.clement.ecmquestionnaires.Controleur.JSTC3;
import etienne.clement.ecmquestionnaires.Controleur.JSTC4;
import etienne.clement.ecmquestionnaires.Controleur.JSTC5;
import etienne.clement.ecmquestionnaires.Controleur.XMLTC1;
import etienne.clement.ecmquestionnaires.Controleur.XMLTC2;
import etienne.clement.ecmquestionnaires.Controleur.XMLTC3;
import etienne.clement.ecmquestionnaires.R;

public class ACTION extends AppCompatActivity implements View.OnClickListener {
    TextView mquestion;
    Button mreponse1;
    Button mreponse2;
    Button mreponse3;
    Button mreponse4;
    Button mreponse5;
    /*MISE EN PLACE DE MES INSTANCES DE CONTROLE POUR LA GENERATION DES QUESTIONS*/
    CTC1 mCTC1;
    CTC2 mCTC2;
    HTML5TC1 mHTML5TC1;
    HTML5TC2 mHTML5TC2;
    JSTC1 mJSTC1;
    JSTC2 mJSTC2;
    JSTC3 mJSTC3;
    JSTC4 mJSTC4;
    JSTC5 mJSTC5;
    XMLTC1 mXMLTC1;
    XMLTC2 mXMLTC2;
    XMLTC3 mXMLTC3;
    CSSTC1 mCSSTC1;
    CSSTC2 mCSSTC2;
    ALGOTC1 mALGOTC1;
    ALGOTC2 mALGOTC2;
    /*....*/
    int quoficient = 0;
    int limite = 0;
    int a = 0;
    int i = 0;
    int note = 0;
    int arretConseil =0;
    ACTION mAction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        //Recuperation des elements de ma vue...
        mquestion = (TextView) findViewById(R.id.txt_question);
        mreponse1 = (Button) findViewById(R.id.btn1);
        mreponse2 = (Button) findViewById(R.id.btn2);
        mreponse3 = (Button) findViewById(R.id.btn3);
        mreponse4 = (Button) findViewById(R.id.btn4);
        mreponse5 = (Button) findViewById(R.id.btn5);

        mAction = this;
        //Attribution de chiffre a mes boutons reponses
        mreponse1.setTag(1);
        mreponse2.setTag(2);
        mreponse3.setTag(3);
        mreponse4.setTag(4);
        mreponse5.setTag(5);

        mreponse1.setOnClickListener(this);
        mreponse2.setOnClickListener(this);
        mreponse3.setOnClickListener(this);
        mreponse4.setOnClickListener(this);
        mreponse5.setOnClickListener(this);
        /*GESTION DE LA PAGE A RECHARGER*/
        Intent mIntent = getIntent();
        if (mIntent != null) {
            String pageCharger = null;
            if (mIntent.hasExtra("PageCharger")) {
                pageCharger = mIntent.getStringExtra("PageCharger");
            }
            if (String.valueOf(pageCharger).equals("CTC1")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mCTC1 = CTC1.getmCTC1();
                mCTC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mCTC1.tableau_questions,
                        mCTC1.tableau_reponses, a);
                limite = 9;
                quoficient = 10;
            } else if (String.valueOf(pageCharger).equals("CTC2")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mCTC2 = CTC2.getmCTC2();
                mCTC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mCTC2.tableau_questions,
                        mCTC2.tableau_reponses, a);
                limite = 5;
                quoficient = 6;
            } else if (String.valueOf(pageCharger).equals("HTML5TC1")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mHTML5TC1 = HTML5TC1.getHTML5TC1();
                mHTML5TC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mHTML5TC1.tableau_questions,
                        mHTML5TC1.tableau_reponses, a);
                limite = 6;
                quoficient = 7;
            } else if (String.valueOf(pageCharger).equals("HTML5TC2")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mHTML5TC2 = HTML5TC2.getHTML5TC2();
                mHTML5TC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mHTML5TC2.tableau_questions,
                        mHTML5TC2.tableau_reponses, a);
                limite = 9;
                quoficient = 10;
            } else if (String.valueOf(pageCharger).equals("JSTC1")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mJSTC1 = JSTC1.getJSTC1();
                mJSTC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mJSTC1.tableau_questions,
                        mJSTC1.tableau_reponses, a);
                limite = 9;
                quoficient = 10;
            } else if (String.valueOf(pageCharger).equals("JSTC2")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mJSTC2 = JSTC2.getJSTC2();
                mJSTC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mJSTC2.tableau_questions,
                        mJSTC2.tableau_reponses, a);
                limite = 9;
                quoficient = 10;
            } else if (String.valueOf(pageCharger).equals("JSTC3")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mJSTC3 = JSTC3.getJSTC3();
                mJSTC3.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mJSTC3.tableau_questions,
                        mJSTC3.tableau_reponses, a);
                limite = 9;
                quoficient = 10;
            } else if (String.valueOf(pageCharger).equals("JSTC4")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mJSTC4 = JSTC4.getJSTC4();
                mJSTC4.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mJSTC4.tableau_questions,
                        mJSTC4.tableau_reponses, a);
                limite = 9;
                quoficient = 10;
            } else if (String.valueOf(pageCharger).equals("JSTC5")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mJSTC5 = JSTC5.getJSTC5();
                mJSTC5.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mJSTC5.tableau_questions,
                        mJSTC5.tableau_reponses, a);
                limite = 9;
                quoficient = 10;
            } else if (String.valueOf(pageCharger).equals("XMLTC1")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mXMLTC1 = XMLTC1.getXMLTC1();
                mXMLTC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mXMLTC1.tableau_questions,
                        mXMLTC1.tableau_reponses, a);
                limite = 19;
                quoficient = 20;
            } else if (String.valueOf(pageCharger).equals("XMLTC2")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mXMLTC2 = XMLTC2.getXMLTC2();
                mXMLTC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mXMLTC2.tableau_questions,
                        mXMLTC2.tableau_reponses, a);
                limite = 13;
                quoficient = 14;
            } else if (String.valueOf(pageCharger).equals("XMLTC3")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mXMLTC3 = XMLTC3.getXMLTC3();
                mXMLTC3.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mXMLTC3.tableau_questions,
                        mXMLTC3.tableau_reponses, a);
                limite = 8;
                quoficient = 9;
            } else if (String.valueOf(pageCharger).equals("CSSTC1")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mCSSTC1 = CSSTC1.getCSSTC1();
                mCSSTC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mCSSTC1.tableau_questions,
                        mCSSTC1.tableau_reponses, a);
                limite = 9;
                quoficient = 10;
            } else if (String.valueOf(pageCharger).equals("CSSTC2")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mCSSTC2 = CSSTC2.getCSSTC2();
                mCSSTC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mCSSTC2.tableau_questions,
                        mCSSTC2.tableau_reponses, a);
                limite = 7;
                quoficient = 8;
            } else if (String.valueOf(pageCharger).equals("ALGOTC1")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mALGOTC1 = ALGOTC1.getALGOTC1();
                mALGOTC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mALGOTC1.tableau_questions,
                        mALGOTC1.tableau_reponses, a);
                limite = 13;
                quoficient = 14;
            }
            else if (String.valueOf(pageCharger).equals("ALGOTC2")) {
                /*CHARGEMENT DE LA CLASSE CONTROLE DANS MA CLASSE VUE*/
                this.mALGOTC2 = ALGOTC2.getALGOTC2();
                mALGOTC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mALGOTC2.tableau_questions,
                        mALGOTC2.tableau_reponses, a);
                limite = 10;
                quoficient = 11;
            }
        }
    }

    @Override
    public void onClick(View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360);
        rotateAnimation.setDuration(400);
        view.startAnimation(rotateAnimation);
        //RECUPERATION DU N° DE BOUTON CLIQUER...
        int reponse = (int) view.getTag();
        //GESTION DE LA PAGE A CHARGER
        Intent mIntent = getIntent();
        if (mIntent != null) {
            String pageCharger = null;
            if (mIntent.hasExtra("PageCharger")) {
                pageCharger = mIntent.getStringExtra("PageCharger");
            }
            if (i < limite) {
                if (String.valueOf(pageCharger).equals("CTC1")) {

                    note += mCTC1.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mCTC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mCTC1.tableau_questions,
                            mCTC1.tableau_reponses, a);

                } else if (String.valueOf(pageCharger).equals("CTC2")) {

                    note += mCTC2.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mCTC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mCTC2.tableau_questions,
                            mCTC2.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("HTML5TC1")) {

                    note += mHTML5TC1.VerificationResultat(a, reponse, mAction, view);
                    a += 1;

                    mHTML5TC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mHTML5TC1.tableau_questions,
                            mHTML5TC1.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("HTML5TC2")) {

                    note += mHTML5TC2.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mHTML5TC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mHTML5TC2.tableau_questions,
                            mHTML5TC2.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("JSTC1")) {

                    note += mJSTC1.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mJSTC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mJSTC1.tableau_questions,
                            mJSTC1.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("JSTC2")) {

                    note += mJSTC2.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mJSTC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mJSTC2.tableau_questions,
                            mJSTC2.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("JSTC3")) {

                    note += mJSTC3.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mJSTC3.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mJSTC3.tableau_questions,
                            mJSTC3.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("JSTC4")) {

                    note += mJSTC4.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mJSTC4.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mJSTC4.tableau_questions,
                            mJSTC4.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("JSTC5")) {

                    note += mJSTC5.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mJSTC5.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mJSTC5.tableau_questions,
                            mJSTC5.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("XMLTC1")) {

                    note += mXMLTC1.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mXMLTC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mXMLTC1.tableau_questions,
                            mXMLTC1.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("XMLTC2")) {

                    note += mXMLTC2.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mXMLTC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mXMLTC2.tableau_questions,
                            mXMLTC2.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("XMLTC3")) {

                    note += mXMLTC3.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mXMLTC3.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mXMLTC3.tableau_questions,
                            mXMLTC3.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("CSSTC1")) {

                    note += mCSSTC1.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mCSSTC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mCSSTC1.tableau_questions,
                            mCSSTC1.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("CSSTC2")) {

                    note += mCSSTC2.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mCSSTC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mCSSTC2.tableau_questions,
                            mCSSTC2.tableau_reponses, a);
                } else if (String.valueOf(pageCharger).equals("ALGOTC1")) {

                    note += mALGOTC1.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mALGOTC1.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mALGOTC1.tableau_questions,
                            mALGOTC1.tableau_reponses, a);
                }
                else if (String.valueOf(pageCharger).equals("ALGOTC2")) {

                    note += mALGOTC2.VerificationResultat(a, reponse, mAction, view);
                    a += 1;
                    mALGOTC2.generation(mquestion, mreponse1, mreponse2, mreponse3, mreponse4, mreponse5, mALGOTC2.tableau_questions,
                            mALGOTC2.tableau_reponses, a);
                }
                i += 1;
            }
            /*Ce else me permet de verfier la dernier reponse du tableau par la methode Verifi..*/
            else {
                if (String.valueOf(pageCharger).equals("CTC1")) {
                    note += mCTC1.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 10;
                }
                if (String.valueOf(pageCharger).equals("CTC2")) {
                    note += mCTC2.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 6;
                }
                if (String.valueOf(pageCharger).equals("HTML5TC1")) {
                    note += mHTML5TC1.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 7;
                }
                if (String.valueOf(pageCharger).equals("HTML5TC2")) {
                    note += mHTML5TC2.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 10;
                }
                if (String.valueOf(pageCharger).equals("JSTC1")) {
                    note += mJSTC1.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 10;
                }
                if (String.valueOf(pageCharger).equals("JSTC2")) {
                    note += mJSTC2.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 10;
                }
                if (String.valueOf(pageCharger).equals("JSTC3")) {
                    note += mJSTC3.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 10;
                }
                if (String.valueOf(pageCharger).equals("JSTC4")) {
                    note += mJSTC4.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 10;
                }
                if (String.valueOf(pageCharger).equals("JSTC5")) {
                    note += mJSTC5.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 10;
                }
                if (String.valueOf(pageCharger).equals("XMLTC1")) {
                    note += mXMLTC1.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 20;
                }
                if (String.valueOf(pageCharger).equals("XMLTC2")) {
                    note += mXMLTC2.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 14;
                }
                if (String.valueOf(pageCharger).equals("XMLTC3")) {
                    note += mXMLTC3.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 9;
                }
                if (String.valueOf(pageCharger).equals("CSSTC1")) {
                    note += mCSSTC1.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 10;
                }
                if (String.valueOf(pageCharger).equals("CSSTC2")) {
                    note += mCSSTC2.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 8;
                }
                if (String.valueOf(pageCharger).equals("ALGOTC1")) {
                    note += mALGOTC1.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 14;
                }
                if (String.valueOf(pageCharger).equals("ALGOTC2")) {
                    note += mALGOTC2.VerificationResultat(a, reponse, mAction, view);
                    quoficient = 11;
                }
                Intent pageFinale = new Intent(ACTION.this, RESULTAT.class);
                pageFinale.putExtra("note", note);
                pageFinale.putExtra("quoficient", quoficient);
                pageFinale.putExtra("pageCharger", pageCharger);
                startActivity(pageFinale);
                finish();
            }
        }
    }
}