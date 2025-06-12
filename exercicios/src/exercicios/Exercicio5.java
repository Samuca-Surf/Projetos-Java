package exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("---Menu---  ");
			System.out.println("1-  Opção 1 ");
			System.out.println("2-  Opção 2 ");
			System.out.println("3-  Sair    ");
			System.out.println("Selecione uma opção: ");
			opcao = scan.nextInt();
			
			if (opcao == 1)
			{
				System.out.println("Escolheu a opção 1 ");
			}
			else if (opcao == 2 ) {
				System.out.println("Escolheu a opção 2 ");
			}
			else if(opcao != 3 ) {
				System.out.println("Erro ");
			}
			else {
				System.out.println("Saindo");
			}
			
		}while(opcao != 3);
		scan.close();
	}
}
