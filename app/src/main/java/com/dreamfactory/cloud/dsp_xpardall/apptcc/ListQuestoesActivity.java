package com.dreamfactory.cloud.dsp_xpardall.apptcc;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.QuestaoAdapter;
import Dao.QuestaoDAO;
import model.Questao;

/**
 * Created by Fatec on 09/03/2015.
 */
public class ListQuestoesActivity extends ActionBarActivity {

    private RecyclerView recyclerView;
    private QuestaoDAO questaoDAO;
    private ArrayList<Questao> questaoList;
    private QuestaoAdapter questaoAdapter;

    @Override
    //public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    public void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState, persistentState);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list_questao);

        questaoDAO = new QuestaoDAO(this);
        questaoList = (ArrayList<Questao>) questaoDAO.listarQuestoes();
        questaoAdapter = new QuestaoAdapter(this,questaoList);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        recyclerView.setAdapter(questaoAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}