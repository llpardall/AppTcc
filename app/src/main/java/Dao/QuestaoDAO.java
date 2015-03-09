package Dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import model.Questao;

/**
 * Created by Fatec on 09/03/2015.
 */
public class QuestaoDAO {

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase database;

    public QuestaoDAO(Context context){
        databaseHelper = new DatabaseHelper(context);
    }

    private SQLiteDatabase getDatabase(){
        if (database == null){
            database = databaseHelper.getWritableDatabase();
        }

        return database;
    }

    private Questao criarQuestao(Cursor cursor){
        Questao model = new Questao(
                cursor.getInt(cursor.getColumnIndex(DatabaseHelper.Questoes._ID)),
                cursor.getString(cursor.getColumnIndex(DatabaseHelper.Questoes.QUESTAO)),
                cursor.getString(cursor.getColumnIndex(DatabaseHelper.Questoes.RESPOSTAA)),
                cursor.getString(cursor.getColumnIndex(DatabaseHelper.Questoes.RESPOSTAB)),
                cursor.getString(cursor.getColumnIndex(DatabaseHelper.Questoes.RESPOSTAC)),
                cursor.getString(cursor.getColumnIndex(DatabaseHelper.Questoes.RESPOSTAD)),
                cursor.getString(cursor.getColumnIndex(DatabaseHelper.Questoes.RESPOSTAE)),
                cursor.getString(cursor.getColumnIndex(DatabaseHelper.Questoes.CORRETA)),
                cursor.getString(cursor.getColumnIndex(DatabaseHelper.Questoes.ASSUNTO))
        );

        return model;
    }

    public List<Questao> listarQuestoes(){
        Cursor cursor = getDatabase().query(DatabaseHelper.Usuarios.TABELA,
                DatabaseHelper.Usuarios.COLUNAS, null, null, null, null, null);

        List<Questao> questoes = new ArrayList<>();
        while(cursor.moveToNext()){
            Questao model = criarQuestao(cursor);
            questoes.add(model);
        }
        cursor.close();
        return questoes;
    }
}
