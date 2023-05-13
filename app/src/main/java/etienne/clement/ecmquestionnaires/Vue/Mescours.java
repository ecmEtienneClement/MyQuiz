package etienne.clement.ecmquestionnaires.Vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import etienne.clement.ecmquestionnaires.R;

public class Mescours extends AppCompatActivity {
 public TextView liencours ,service ,portail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mescours);

        liencours = (TextView)findViewById(R.id.liencours);
        liencours.setMovementMethod(LinkMovementMethod.getInstance());

        service = (TextView)findViewById(R.id.service);
        service.setMovementMethod(LinkMovementMethod.getInstance());

        portail = (TextView)findViewById(R.id.portail);
        portail.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void retour(View view) {
        TranslateAnimation trans = new TranslateAnimation(0,-450,0,0);
        trans.setDuration(1000);
        view.startAnimation(trans);
        Handler attendre = new Handler();
        attendre.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pageAcceuille = new Intent(getApplicationContext(), ACCEUILLE.class);
                startActivity(pageAcceuille);

                finish();
            }
        },1000);
    }
}
