package Holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import com.dreamfactory.cloud.dsp_xpardall.apptcc.R;

/**
 * Created by Fatec on 09/03/2015.
 */
public class QuestaoViewHolder extends RecyclerView.ViewHolder {

    private Context context;
    public TextView txvQuestao;
    public RadioButton rdbOpA,rdbOpB,rdbOpC,rdbOpD,rdbOpE;

    public QuestaoViewHolder(Context context, View itemView) {
        super(itemView);
        this.context = context;

        txvQuestao = (TextView) itemView.findViewById(R.id.txvQuestao);
        rdbOpA = (RadioButton) itemView.findViewById(R.id.rdbOpA);
        rdbOpB = (RadioButton) itemView.findViewById(R.id.rdbOpB);
        rdbOpC = (RadioButton) itemView.findViewById(R.id.rdbOpC);
        rdbOpD = (RadioButton) itemView.findViewById(R.id.rdbOpD);
        rdbOpE = (RadioButton) itemView.findViewById(R.id.rdbOpE);
    }
}
