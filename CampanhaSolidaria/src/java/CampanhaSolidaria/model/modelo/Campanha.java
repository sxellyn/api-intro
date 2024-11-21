/*
representa uma campanha de arrecadação.
permite às ONGs criarem campanhas relacionadas a emergências para arrecadar insumos específicos.
 */
package CampanhaSolidaria.model.modelo;
import java.time.LocalDate;

/**
 * @author Suellyn Gomes
 */
 
public class Campanha {

//atributos da entidade
    private int codigo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String objetivo;
    private String descricao;

//construtor
    public Campanha(int codigo, LocalDate dataInicio, LocalDate dataFim, String objetivo, String descricao) {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.objetivo = objetivo;
        this.descricao = descricao;
                
    }
    
    //get:
    public int getCodigo(){
        return codigo;
    }
    
    
    public LocalDate getDataInicio(){
        return dataInicio;
    }
    
    public LocalDate getDataFim(){
        return dataFim;
    }
    
    public String getObjetivo(){
        return objetivo;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    //set:
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setDataInicio(LocalDate dataInicio){
        this.dataInicio = dataInicio;
    }
    
    public void setDataFim(LocalDate dataFim){
        this.dataFim = dataFim;
    }
    
    public void setObjetivo(String objetivo){
        this.objetivo = objetivo;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}
