package aula46;

import java.util.Scanner;
import java.util.Arrays;

public class OutroVetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] temperaturas = new int[5];
		
		for (int t = 0; t < temperaturas.length; t++) {
			System.out.println("Digite uma temperatura ");
			temperaturas[t] = sc.nextInt();
		}
		System.out.println(Arrays.toString(temperaturas));
		sc.close();
	}
}
