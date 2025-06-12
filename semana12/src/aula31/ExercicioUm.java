package aula31;
import java.util.*;

public class ExercicioUm {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] itens = new int[5];
		int total = 0;
		double media;
		
		
		System.out.println("Digite 5 valores: ");
		// :::pode ser tanto (i < 5) quanto (i < itens.length):::
		for (int i = 0; i < itens.length; i++) {
			itens[i] = sc.nextInt();
			total = itens[i]+ total;
		
		}
		
		System.out.println("Total: " + total);
		media = total/5;
		System.out.println("Média: " + media);
		
		sc.close();
	}
}
