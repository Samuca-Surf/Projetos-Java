package projetoBiblioteca;
import java.util.*;
public class OutraBiblioteca {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);	
			ArrayList<Livro> biblioteca = new ArrayList<>();
			int op=0;
			do{
				System.out.println("---ESCOLHA---\n0- Sair\n1- Cadastrar Livro\n2- Exibir Acervo");
				op = sc.nextInt();
				sc.nextLine();
				switch(op) {
					case 1: 
						System.out.print("Digite o nome do livro: ");
						String titulo= sc.nextLine();
						System.out.print("Digite o nome do autor: ");
						String autor = sc.nextLine();
						System.out.print("Digite o ano de publicação do livro: ");
						int anoPub = sc.nextInt();
						System.out.print("Digite o ISBN do livro: ");
						int isbn = sc.nextInt();
						
						Livro novoLivro = new Livro(titulo, autor, anoPub, isbn);
						biblioteca.add(novoLivro);
						System.out.println("Novo livro cadastrado");
						break;
						
					case 2: 
						System.out.println("---Acervo---");
						for (int i=0; i < biblioteca.size(); i++) {
							System.out.print("Livro: ");
							biblioteca.get(i).mostrarLivro();
						}
						break;
					
					default: 
						if (op == 0 ) {
							System.out.println("SAINDO");break;
						}else {
						System.out.println("Opção Inválida");
						}
						break;
				}
			}while(op !=0);
		}		
}
