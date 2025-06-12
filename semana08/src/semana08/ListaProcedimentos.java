package semana08;
import java.util.Scanner;

public class ListaProcedimentos {
	
	public static void hello() {
		System.out.println("Bem vindo");
	}
	
	public static void imprimir(int n) {
		for (int i =1 ; i <= n; i++) {
			System.out.println(i);
		}
	}
	
	public static void tabuada(int a) {
		for (int p = 1; p <= 10; p++) {
			System.out.println(a*p);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		hello();
		System.out.println("Digite um numero: ");
		int n = scan.nextInt();
		imprimir(n);
		
		System.out.println("Digite outro número: ");
		int a = scan.nextInt();
		tabuada(a);
		
		scan.close();
	}
	
	
	
}
