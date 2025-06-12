package pacote;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		boolean vip;
		int compras;
		
		vip = sc.nextBoolean();
		compras = sc.nextInt();
		
		if (vip || compras > 4) {
			System.out.println("Receberá desconto");
		}else 
			System.out.println("Não receberá desconto");
	}
	
}
