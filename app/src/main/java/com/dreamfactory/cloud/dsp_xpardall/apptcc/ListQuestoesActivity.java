package com.dreamfactory.cloud.dsp_xpardall.apptcc;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import Adapter.QuestaoAdapter;
import Dao.QuestaoDAO;
import model.Questao;

/**
 * Created by Fatec on 09/03/2015.
 */
public class ListQuestoesActivity extends ActionBarActivity {

    private RecyclerView recyclerView;
    private QuestaoDAO questaoDAO;
    private List<Questao> questaoList;
    private QuestaoAdapter questaoAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.list_questao);

        questaoDAO = new QuestaoDAO(this);
        questaoList = questaoDAO.listarQuestoes();
        questaoAdapter = new QuestaoAdapter(this,questaoList);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        recyclerView.setAdapter(questaoAdapter);
    }
}
