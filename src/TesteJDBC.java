import br.teste.jdbc.dao.InserindoDados;
import br.teste.jdbc.dao.Selecoes;

public class TesteJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InserindoDados();
		new Selecoes().selecaoMedia();
		Selecoes.selecaoDeUsuariosMedia();
	}

}
