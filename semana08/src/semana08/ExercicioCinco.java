package semana08;
import java.util.Scanner;

public class ExercicioCinco {
	
	public static void conversor() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o valor em reais: ");
		float real = scan.nextFloat();
		float dolar = real/6;
		System.out.printf("O valor em dolar: \n%.2f ", dolar);
		
		scan.close();
	}
	public static void main(String[] args) {
		conversor();
	}
}
