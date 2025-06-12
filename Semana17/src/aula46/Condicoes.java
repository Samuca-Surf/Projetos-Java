package aula46;
import java.util.Scanner;

public class Condicoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite a qtd de compras: ");
		int compras = sc.nextInt();
		System.out.print("Digite para veradeiro ou falso(true || false): ");
		boolean ehVip = sc.nextBoolean();
		
		if (ehVip && compras > 4) {
			System.out.println("É Vip");
			System.out.println(ehVip);
			System.out.println(compras);
		}else {
			System.out.println("Não é Vip");
			System.out.println(ehVip);
			System.out.println(compras);
		}
		
	}
}
