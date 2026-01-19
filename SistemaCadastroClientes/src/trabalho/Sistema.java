package trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		CadastroCliente cadastro = new CadastroCliente();
		
		String nome, email, nomeBuscar;
		int idade, escolha;
		
		do {
			System.out.println("Escolha qual opção você deseja: ");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Buscar Cliente por Nome");
			System.out.println("4 - Sair");
			escolha = s.nextInt();
			s.nextLine();
			
			if(escolha == 1) {
				System.out.println("Digite o nome: ");
				nome = s.next();
				
				System.out.println("Digite o email: ");
				email = s.next();
				
				System.out.println("Digite a idade: ");
				idade = s.nextInt();
				
				s.nextLine();
				
				Clientes novo = new Clientes(nome, email, idade);
				cadastro.cadastrar(novo);
				
				System.out.println("Cliente cadastrado com sucesso!");
			}
			else if(escolha == 2) {
				System.out.println("Lista de clientes:");
				cadastro.listar();
			}
			else if(escolha == 3) {
				System.out.println("Digite o nome do cliente para buscar: ");
				nomeBuscar = s.next();
				
				Clientes encontrado = cadastro.buscar(nomeBuscar);
				if(encontrado != null) {
					System.out.println("Cliente Encontrado: " + encontrado.getNome() + " - " + encontrado.getEmail() + " - " + encontrado.getIdade());
				} 
				else {
					System.out.println("Cliente não encontrado!");
				}
		   }
		} while (escolha != 4);
		System.out.println("Programa encerrado");
	}
}