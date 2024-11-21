/*
itens ou recursos que podem ser arrecadados durante uma campanha.
permite categorizar e organizar os itens arrecadados nas campanhas.
 */
package CampanhaSolidaria.model.modelo;

/**
 * @author Suellyn Gomes
 */

public class Insumo {

    //atributos da entidade 
    private int codigo;
    private String nome;
    private String marca;
    private String categoria;

    //construtor:
    public Insumo(int codigo, String nome, String marca, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
    }
    
    //get:
    public int getCodigo(){
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    //set:
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setNome(String nome){
       this.nome = nome;
    }
    
    public void setMarca(String marca){
        this.marca = marca; 
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
}
