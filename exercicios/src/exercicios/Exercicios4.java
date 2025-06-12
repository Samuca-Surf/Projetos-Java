package exercicios;
import java.util.Scanner;

public class Exercicios4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		int num;
		int soma = 0;
		
		do{
			num = entrada.nextInt();
			if (num > 0 ) {
				soma = soma + num;
			}
			
		}while(num >= 0);
		System.out.println("A soma é: " + soma);
	
		entrada.close();
	}
}
