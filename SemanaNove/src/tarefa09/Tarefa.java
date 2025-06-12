package tarefa09;
import java.util.Scanner;

public class Tarefa {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome do hospede: ");
		String nome = scan.nextLine();
		System.out.println("Digite o tipo de apartamento: ");
		char tipoDeAp = scan.next().toUpperCase().charAt(0);
		System.out.println("Quantas diarias: ");
		int numDiarias = scan.nextInt();
		System.out.println("Valor de consumo interno: " );
		double consumoInterno = scan.nextDouble();
		
		
		double valorDiaria = 0;
		switch (tipoDeAp) {
			case 'A': valorDiaria = 450.00; break;
			case 'B': valorDiaria = 375.00; break;
			case 'C': valorDiaria = 299.00;	break;
			case 'D': valorDiaria = 249.00; break;
			default:
				System.out.println("Apartamento Inválido");
				scan.close();	
		}
		double custoDiarias = valorDiaria * numDiarias; 
		double subtotal = custoDiarias + consumoInterno;
		double taxa = subtotal * 0.1;
		double valorFinal = subtotal + taxa;
		System.out.println("~~~~~~ Conta Final ~~~~~~");
		System.out.println("Hóspede: " + nome);
		System.out.println("Apartamento: " + tipoDeAp);
		System.out.println("Número diárias: " + numDiarias);
		System.out.println("Consumo Interno: " + consumoInterno);
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Taxa de Servço: " + taxa);
		System.out.println("VALOR FINAL: " + valorFinal);
		
	}
	
	
		
}