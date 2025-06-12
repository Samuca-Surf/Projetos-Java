package exercicios;
import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int num = scan.nextInt();

		for (int i= 0; i <= 10 ; i++) {
			int resultado = num*i;
			System.out.println(num + "x" + i + " =  " + resultado);
		}
		scan.close();
	}
}