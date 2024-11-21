package CampanhaSolidaria.model.repositorios;

/*
repositorio de insumos das campanhas, vai armazenar os itens a serem doados.
 */
import CampanhaSolidaria.model.modelo.Insumo;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Suellyn Gomes
 */
public class RepositorioInsumos {

    private static List<Insumo> insumos = new ArrayList<>();

    public static void inserir(Insumo item) {
        insumos.add(item);
    }

    public static void alterar(Insumo item) {

        for (Insumo insumoTemp : insumos) {
            if (insumoTemp.getCodigo() == item.getCodigo()) {
                insumoTemp.setNome(item.getNome());
                insumoTemp.setMarca(item.getMarca());
                insumoTemp.setCategoria(item.getCategoria());
            }
        }

    }

    public static void deletar(int codigo) {
        insumos.removeIf(insumo -> insumo.getCodigo() == codigo);

    }

    public static List<Insumo> lerTudo() {
        return insumos;
    }

}
