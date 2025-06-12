package dia22_04_2025;

import java.util.*;

public class PrimeiraAula {

		public static void main(String[] args ) {
			//int[] numeros = new int[5];
			Scanner scan = new Scanner(System.in);
			
			int[] numeros = {1 , 3 , 5, 7, 9};	// {0 , 1 , 2 , 3 , 4}
			System.out.print("Digite um numero:  ");
			numeros[2] = scan.nextInt();
			numeros[4] = 50;  //Está trocando o {9} que está na posição 4;
 			
			
			System.out.println("	=== PRIMEIRO FOR ===");
			for (int i = 0 ; i < numeros.length ; i++) {
				//System.out.println(i);
				System.out.println("First FOR:	"+ numeros[i]);
			}
			
			System.out.println("	=== SECOND FOR ===	");
			for(int i : numeros) {
				System.out.println("Second FOR:	"+ i);
			}
			System.out.println("	=== ARRAYS TO STRING ===	");
			System.out.println(Arrays.toString(numeros));
			
		}
}
