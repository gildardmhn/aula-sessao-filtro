import java.util.ArrayList;

public class PessoaDAO {
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void cadastarPessoas() {
		pessoas.add(new Pessoa("Gildard","123"));
		pessoas.add(new Pessoa("Gabriel","456"));
		pessoas.add(new Pessoa("Weliton","789"));
		pessoas.add(new Pessoa("Robson","000"));
	}
	
	public Pessoa buscarPessoa(String login, String senha) {
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getLogin().equals(login) && pessoa.getSenha().equals(senha)) {
				return pessoa;
			}
		}
		
		return null;
	}
}
