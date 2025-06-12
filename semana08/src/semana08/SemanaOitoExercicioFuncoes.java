package semana08;
import java.util.Scanner;

public class SemanaOitoExercicioFuncoes {
	
	public static int soma(int a , int b) {
		return a + b;
	}
	
	public static String parOuImpar(int c) {
		return (c % 2 == 0) ? "  Par" : "  Impar";
	}
	
	public static int fatorial(int num) {
		if(num == 0) {
			return 1;
		}
		return num * fatorial(num-1);
	}
	
	public static String inverter(String palavra) {
		return new StringBuilder(palavra).reverse().toString();
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(soma(3, 8));
		System.out.println(parOuImpar(4));
		System.out.println(fatorial(10));
		System.out.println(inverter("hello"));
		
		scan.close();
	}
}