package revisao;
import java.util.Scanner;

public class Calculadora {
	
	public static double somar(double numA , double numB ) {
		return numA+numB;
	}
	
	public static double subtrair(double numA , double numB) {
		return numA-numB;
	}
	
	public static double multiplicar(double numA , double numB) {
		return numA*numB;
	}
	
	public static double dividir(double numA , double numB)
	{	
		return numA/numB;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		int opcao;
		
		System.out.print("Digite o primeiro número: ");
		a= sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		b=sc.nextDouble();
		
		System.out.println("Escolha: \n1 - SOMAR\n2 - SUBTRAIR\n3 - MULTIPLICAR\n4 - DIVIDIR");
		opcao = sc.nextInt();
		switch(opcao) {
			case 1: System.out.println("SOMA: " + somar(a, b)); break;
			case 2:
				System.out.println("SUBTRAÇÃO: " + subtrair(a, b)); break;
			case 3:
				System.out.println("MULTIPLICAÇÃO: " + multiplicar(a, b)); break;
			case 4:
				System.out.println("DIVISÃO: " + dividir(a, b));	break;
			default:
				System.out.println("Tente de novo");
				break;
		}
		
		sc.close();
		
	}
	
}
