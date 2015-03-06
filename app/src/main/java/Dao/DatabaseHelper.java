package Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import model.Questao;
import model.Tarefa;
import model.Usuario;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String BANCO_DADOS = "conc";
    private static final int VERSAO = 1;

    public DatabaseHelper(Context context){
        super(context, BANCO_DADOS, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, Usuario.class);
            TableUtils.createTable(connectionSource, Tarefa.class);
            TableUtils.createTable(connectionSource, Questao.class);
            sqLiteDatabase.execSQL("insert into usuarios(nome, login, senha) values('Admin', 'admin', '123')");
            sqLiteDatabase.execSQL("insert into question(questao, respostaa, respostb,respostac,respostad,correta,assunto)" +
                    " values('De acordo com a Norma Culta da Língua Portuguesa, assinale a única alternativa que está de acordo com a Gramática:" +
                    "', 'A senhora que a pouco foi atropelada é aquela que eu te falei.'" +
                    ", 'A senhora que a pouco foi atropelada é aquela de que eu te falei.'," +
                    "'A senhora que há pouco foi atropelada é aquela que eu lhe falei.'," +
                    "'A senhora que há pouco foi atropelada é aquela de que eu lhe falei.'," +
                    "'d','Português')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i2) {
        try {
            TableUtils.dropTable(connectionSource, Usuario.class,true);
            TableUtils.dropTable(connectionSource, Tarefa.class,true);
            TableUtils.dropTable(connectionSource, Questao.class,true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        onCreate(sqLiteDatabase,connectionSource);
    }


    public static class Usuarios{
        public static final String TABELA = "usuarios";
        public static final String _ID = "_id";
        public static final String NOME = "nome";
        public static final String LOGIN = "login";
        public static final String SENHA = "senha";

        public static final String[] COLUNAS = new String[]{
            _ID, NOME, LOGIN, SENHA
        };
    }

    public static class Tarefas{
        public static final String TABELA = "tarefas";
        public static final String _ID = "_id";
        public static final String TAREFA = "tarefa";
        public static final String DT_CRIACAO = "dt_criacao";
        public static final String DT_COMPLETADO = "dt_completado";

        public static final String[] COLUNAS = new String[]{
                _ID, TAREFA, DT_CRIACAO, DT_COMPLETADO
        };
    }
}
