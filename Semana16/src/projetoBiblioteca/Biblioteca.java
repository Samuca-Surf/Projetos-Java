package projetoBiblioteca;
import java.util.*;
public class Biblioteca {
	static ArrayList<Livro> listaLivro = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int op=0;
		do{
			System.out.println("---ESCOLHA---\n1- Cadastrar Livro\n2- Listar Livro\nE aperte 0 para SAIR");
			op = sc.nextInt();
			switch(op) {
				case 1: cadastrar(); break;
				case 2: listar();break;
				default: 				
					System.out.println("Tente de novo");break;
				case 0: System.out.println("SAINDO"); break;
			}
		}while(op != 0);
		sc.close();
	}
	
	public static void cadastrar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do livro: ");
		String titulo= sc.nextLine();
		System.out.print("Digite o nome do autor: ");
		String autor = sc.nextLine();
		System.out.print("Digite o ano de publicação do livro: ");
		int anoPub = sc.nextInt();
		System.out.print("Digite o ISBN do livro: ");
		int isbn = sc.nextInt();
		
		Livro l1 = new Livro(titulo , autor, anoPub, isbn);		
		
		listaLivro.add(l1);
		System.out.println("Livro cadastrado com sucesso");	
		sc.close();
	}
	
	
	public static void listar() {
		for (Livro livro : listaLivro) {
			livro.mostrarLivro();
		}
		
	}
	
}
