package dia24_04_2025;

import java.util.Arrays;
import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
		int[][] num = {
				//coluna
				{20 , 2},	
				{30 , 03},
  /* coluna */  {40 , 4},
				{50 , 5},
				{60 , 6}
		};
		
		for (int i=0; i < num.length; i++)// Vai andar pelas linhas;	i = linha;
		{
			for(int j = 0; j < num[i].length; j++)// Vai andar pela coluna ;	j  = coluna;
			{
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
		
		mainComScanner();
	}
	
	public static void mainComScanner() 
	{
		Scanner scan = new Scanner(System.in); 
		
		int[][] matriz = new int[3][3];
		
		for (int i=0; i < 3; i++) {
			for(int j = 0; j < 3 ; j++ ) {
				System.out.println("Elemento: " +" Linha: "+ i + " E " +" Coluna: "+ j);
				matriz[i][j] = scan.nextInt();
			}
		}
		System.out.println("Matriz:  ");
		for(int[] linha : matriz) 
		{
			for(int coluna : linha) 
			{
				System.out.print(coluna + "\t");
			}
			System.out.println();
		}
		scan.close();
	}
	
}