package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by Usuario on 30/01/2015.
 */

@DatabaseTable(tableName = "Question")
public class Questao {
    @DatabaseField(generatedId = true)
    private int _id;
    @DatabaseField
    private String questao;
    @DatabaseField
    private String respostaA;
    @DatabaseField
    private String respostaB;
    @DatabaseField
    private String respostaC;
    @DatabaseField
    private String respostaD;
    @DatabaseField
    private String respostaE;
    @DatabaseField
    private String correta;
    @DatabaseField
    private String assunto;

    public Questao(){}

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public String getRespostaA() {
        return respostaA;
    }

    public void setRespostaA(String respostaA) {
        this.respostaA = respostaA;
    }

    public String getRespostaB() {
        return respostaB;
    }

    public void setRespostaB(String respostaB) {
        this.respostaB = respostaB;
    }

    public String getRespostaC() {
        return respostaC;
    }

    public void setRespostaC(String respostaC) {
        this.respostaC = respostaC;
    }

    public String getRespostaD() {
        return respostaD;
    }

    public void setRespostaD(String respostaD) {
        this.respostaD = respostaD;
    }

    public String getCorreta() {
        return correta;
    }

    public void setCorreta(String correta) {
        this.correta = correta;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getRespostaE() {
        return respostaE;
    }

    public void setRespostaE(String respostaE) {
        this.respostaE = respostaE;
    }
}
