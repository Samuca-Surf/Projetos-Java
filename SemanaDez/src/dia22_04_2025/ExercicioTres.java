package dia22_04_2025;
import java.util.Arrays;
import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] notas = {7.5 , 10 , 6, 9};
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			soma = soma + notas[i];	
		}
		
		double media = soma/notas.length;
		System.out.println("A média é " + media);
		scan.close();
	}
}