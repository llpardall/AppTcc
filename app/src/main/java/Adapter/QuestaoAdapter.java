package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dreamfactory.cloud.dsp_xpardall.apptcc.R;

import java.util.ArrayList;

import Holder.QuestaoViewHolder;
import model.Questao;

/**
 * Created by Fatec on 09/03/2015.
 */
public class QuestaoAdapter extends RecyclerView.Adapter<QuestaoViewHolder> {

    private Context context;
    private ArrayList<Questao> itens;

    public QuestaoAdapter(Context context,ArrayList<Questao> itens) {
        this.context = context;
        this.itens = itens;
    }

    @Override
    public QuestaoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_questao,viewGroup,false);
        QuestaoViewHolder viewHolder = new QuestaoViewHolder(context,view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(QuestaoViewHolder questaoViewHolder, int i) {
        Questao questao = itens.get(i);
        questaoViewHolder.txvQuestao.setText(questao.getQuestao());
        questaoViewHolder.rdbOpA.setText(questao.getRespostaA());
        questaoViewHolder.rdbOpB.setText(questao.getRespostaB());
        questaoViewHolder.rdbOpC.setText(questao.getRespostaC());
        questaoViewHolder.rdbOpD.setText(questao.getRespostaD());
        questaoViewHolder.rdbOpE.setText(questao.getRespostaE());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
