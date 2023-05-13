package etienne.clement.ecmquestionnaires.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import etienne.clement.ecmquestionnaires.R;
import etienne.clement.ecmquestionnaires.Vue.Apropos;

/**
 * created by ETIENNE CLEMENT MBAYE on 2/22/21.
 */
public class GestionnaireListeView extends ArrayAdapter<AproposModel> {
    public GestionnaireListeView(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View maVueAproposModel;
        LayoutInflater layoutInflater =(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        maVueAproposModel = layoutInflater.inflate(R.layout.apropos_model_de_vue,null);
        AproposModel aproposModel = getItem(position);
        TextView titre = (TextView)maVueAproposModel.findViewById(R.id.titre);
        TextView corps = (TextView)maVueAproposModel.findViewById(R.id.corps);
        titre.setText(aproposModel.getTitre());
        corps.setText(aproposModel.getCorps());
        return maVueAproposModel;
    }
}
