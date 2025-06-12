package exercicios;
import java.util.Scanner;

public class ExercicioOito {
	//procedimento, void;	
	public static void exibirMessangem(String nome) 
	{
		System.out.println("Olá " + nome + "! Seja bem vindo(a).");	
	}
	
	public static int calcularQuadrado(int numero) {
		return numero*numero;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		exibirMessangem("Fantasma");
		System.out.println("Digite um numero");
		int numero = scan.nextInt();
		
		int resultado = calcularQuadrado(numero);
		System.out.println("O quadrado de " + numero + " é " + resultado);
		
		
		scan.close();
	}
	
}
