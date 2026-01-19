package trabalho;

import java.util.ArrayList;

public class CadastroCliente {
	private ArrayList<Clientes> clientes = new ArrayList<>();
	
	public void cadastrar(Clientes c) {
		clientes.add(c);
	}
	
	public void listar() {
		for (Clientes c: clientes) {
			System.out.println(c.getNome() + " - " + c.getEmail() + " - "  + c.getIdade());
		}
	}
	
	public Clientes buscar(String nomeBuscar) {
		for(Clientes c : clientes) {
			if(c.getNome().equalsIgnoreCase(nomeBuscar)) {
				return c;
			}
		}
		return null;
	}
}