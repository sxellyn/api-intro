/*
uma situação de emergência que pode motivar a criação de uma campanha.
serve para registrar e detalhar emergências que estão associadas às campanhas criadas pelas ONGs.
 */
package CampanhaSolidaria.model.modelo;

/**
 * @author Suellyn Gomes
 */
public class Emergencia {

    //atributos da entidade
    private int codigo;
    private String local;
    private String tipo;
    private String descricao;

    //construtor
    public Emergencia(int codigo, String local, String tipo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.local = local;
        this.tipo = tipo;
    }

    //get:
    public int getCodigo() {
        return codigo;
    }

    public String getLocal() {
        return local;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    //set:
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
