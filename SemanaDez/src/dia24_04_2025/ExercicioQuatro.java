package dia24_04_2025;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matriz = new int[2][3];
		/*int[][] matriz = 
		{
			{1 , 2 , 3},
			{4 , 5 , 6}
		};*/
		
		int soma = 0;
		
		
		int maior = matriz[0][0];
		int menor = matriz[0][0];
		
		
		for(int[] linha : matriz) 
		{
			for(int coluna : linha) 
			{
				System.out.print("Digite o elemento: ");
				coluna = scan.nextInt();
				soma = soma + coluna; 	
				if (coluna > maior) maior = coluna;
				if (coluna < menor) menor = coluna;
			}
		}
		System.out.println("A soma dará " + soma);
		System.out.println("O maior número é: " + maior);
		System.out.println("O maior número é: " + menor);
	}
}