package CampanhaSolidaria.model.repositorios;

/*
repositorio de insumos das campanhas, vai armazenar os itens a serem doados.
 */
import CampanhaSolidaria.model.modelo.Ong;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Suellyn Gomes
 */
public class RepositorioOngs {

    private static List<Ong> ongs = new ArrayList<>();

    public static void inserir(Ong item) {
        ongs.add(item);

    }

    public static void alterar(Ong item) {

        for (Ong ongTemp : ongs) {
            if (ongTemp.getCodigo() == item.getCodigo()) {
                ongTemp.setLogin(item.getLogin());
                ongTemp.setNome(item.getNome());
                ongTemp.setSenha(item.getSenha());
            }
        }

    }

    public static void deletar(int codigo) {
        ongs.removeIf(ong -> ong.getCodigo() == codigo);

    }

    public static List<Ong> lerTudo() {
        return ongs;
    }

}
