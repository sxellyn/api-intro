/*
organização não governamental (ONG) que pode criar campanhas para arrecadar insumos.
usada para gerenciar e identificar as ONGs que cadastram campanhas de arrecadação no sistema.
 */
package CampanhaSolidaria.model.modelo;

/**
 * @author Suellyn Gomes
 */

public class Ong {

    //atributos da entidade
    private int codigo;
    private String nome;
    private String login;
    private String senha;

    //construtor
    public Ong(int codigo, String nome, String login, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    // get:
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    //set:
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
