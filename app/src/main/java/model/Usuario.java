package model;

import com.j256.ormlite.field.DatabaseField;

public class Usuario {
    @DatabaseField(id = true)
    private Integer _id;
    @DatabaseField(canBeNull = false)
    private String nome;
    @DatabaseField
    private String login;
    @DatabaseField
    private String senha;

    public Usuario(){}

    public Usuario(Integer id, String nome, String login, String senha){
        this._id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }
}
