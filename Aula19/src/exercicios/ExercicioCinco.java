package exercicios;
import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num , soma;
		soma = 0;
		
		System.out.println("Digite um numero (-1 para sair)");
		num = scan.nextInt();
		
		while (num > -1 ) {
			soma += num ;
			System.out.print("Digite outro numero:  ");
			num = scan.nextInt();
		}
		System.out.println("A soma é:  " +  soma);
		scan.close();
	}
}
