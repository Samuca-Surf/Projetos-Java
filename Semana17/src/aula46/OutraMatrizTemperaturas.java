package aula46;
import java.util.Arrays;
import java.util.Scanner;
public class OutraMatrizTemperaturas {
		public static void main(String[] args) {
			int[][] temperaturas = new int[3][2];//	3 linhas , 	2 colunas;
			/*
				[  |  ]		linha0
				[  |  ]		linha1
				[  |  ]		linha2
		coluna:  0	 1		
			*/
			Scanner sc = new Scanner(System.in);
			
			for (int i=0; i<temperaturas.length; i++) //linha;
			{
				for(int j=0; j < temperaturas[i].length; j++) //coluna;
				{
					System.out.println("Digite uma temperatura: ");
					temperaturas[i][j] = sc.nextInt();
				}
				System.out.println();
			}
			
			
			
			
			
			
			/*int[][] temperaturas = {
					{22,25,28}, //linha1	==  0
					{15,16,18}};//linha2	==  1
			//coluna  1, 2, 3	==	0,	1,	2
			
			for (int i=0; i<temperaturas.length; i++) //linha;
			{
				for(int j=0; j < temperaturas[i].length; j++) //coluna;
				{
					System.out.print(temperaturas[i][j] + "\t" );
				}
				
			}*/
		}
}
