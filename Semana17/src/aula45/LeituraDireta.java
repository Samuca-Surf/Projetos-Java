package aula45;
import java.util.Scanner;

public class LeituraDireta {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua idade:  ");
		String leitura = sc.nextLine();
		int idade = Integer.parseInt(leitura);
		
		System.out.print("Digite seu nome:  ");
		String nome = sc.nextLine();
		
		System.out.println("Seu nome é " + nome);
		System.out.println("Sua idade é "+ idade);
		sc.close();
	}
}
