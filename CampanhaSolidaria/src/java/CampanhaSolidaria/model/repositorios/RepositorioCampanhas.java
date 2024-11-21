package CampanhaSolidaria.model.repositorios;

/*
repositorio de insumos das campanhas, vai armazenar os itens a serem doados.
 */
import CampanhaSolidaria.model.modelo.Campanha;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Suellyn Gomes
 */
public class RepositorioCampanhas {

    private static List<Campanha> campanhas = new ArrayList<>();

    public static void inserir(Campanha item) {
        campanhas.add(item);
    }

    public static void alterar(Campanha item) {

        for (Campanha campanhaTemp : campanhas) {
            if (campanhaTemp.getCodigo() == item.getCodigo()) {
                campanhaTemp.setDataInicio(item.getDataInicio());
                campanhaTemp.setDataFim(item.getDataFim());
                campanhaTemp.setDescricao(item.getDescricao());
                campanhaTemp.setObjetivo(item.getObjetivo());
            }

        }
    }

    public static void deletar(int codigo) {
        campanhas.removeIf(campanha -> campanha.getCodigo() == codigo);
    }

    public static List<Campanha> lerTudo() {
        return campanhas;
    }

}
