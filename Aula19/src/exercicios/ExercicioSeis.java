package exercicios;
import java.util.Random;
import java.util.Scanner;

public class ExercicioSeis {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		Scanner scan = new Scanner(System.in);
		
		int numsecret = aleatorio.nextInt(100) + 1;
		int palpite;
		
		System.out.println("Adivinhe um numero de 1 a 100");
		
		while(true) 
		{
			palpite = scan.nextInt();
			if (palpite == numsecret) {
				System.out.println("Acertou");
				break;
			}else if (palpite < numsecret) {
				System.out.println("Muito baixo ");
			}else {
				System.out.println("Muito alto");
			}
		}
		scan.close();
	}
}
