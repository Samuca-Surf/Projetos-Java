package dia22_04_2025;
import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double precos[] = new double[5];
		double soma =0;
		
		for (int i =0; i < precos.length; i++) {
			System.out.println("Digite o valor do produto");
			precos[i] = scan.nextDouble();
			soma += precos[i];
		}
		double media = soma/precos.length;
		System.out.println("A soma dos produtos é " + soma);
		System.out.println("O valor médio é " + precos);
		
	}
}
