package aula46;

import java.util.Arrays;

public class MatrizTemperatura {
	public static void main(String[] args) {
		int[][] temperaturas = {
				{22,25,28}, //linha1	==  0
				{15,16,18}};//linha2	==  1
		//coluna  1, 2, 3	==	0,	1,	2
		
		temperaturas[0][0]= 24;
		System.out.println(temperaturas[1][2]);
		System.out.println(Arrays.deepToString(temperaturas));		// deep == Aprofundada;
		
		
		
	}
}
