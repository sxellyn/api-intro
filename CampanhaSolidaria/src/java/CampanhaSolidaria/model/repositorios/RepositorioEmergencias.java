package CampanhaSolidaria.model.repositorios;

/*
repositorio de insumos das campanhas, vai armazenar os itens a serem doados.
 */

import CampanhaSolidaria.model.modelo.Emergencia;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Suellyn Gomes
 */

public class RepositorioEmergencias {

    private static List<Emergencia> emergencias = new ArrayList<>();

    public static void inserir(Emergencia item) {
        emergencias.add(item);
    }

    public static void alterar(Emergencia item) {

        for (Emergencia emergenciaTemp : emergencias) {
            if (emergenciaTemp.getCodigo() == item.getCodigo()) {
                emergenciaTemp.setLocal(item.getLocal());
                emergenciaTemp.setTipo(item.getTipo());
                emergenciaTemp.setDescricao(item.getDescricao());
            }
        }
    }

    public static void deletar(int codigo) {
emergencias.removeIf(emergencia -> emergencia.getCodigo() == codigo);
    }

    public static List<Emergencia> lerTudo() {
        return emergencias;
    }
       
}
