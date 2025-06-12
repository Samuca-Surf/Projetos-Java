package revisao;
import java.util.Scanner;

public class TesteFuncao {

	//FUNÇÔES retornam um valor;
	public static String gerarString() {
		return "avaliação";
	}
	
	public static int gerarNumero(int x) {
		x = x + 50;
		return x;
	}
	
	
	//Procedimento sempre é VOID;(n precisa retornar um valor, pois é void(vazio))
	public static void mostrarNumero(int y) {
		y= y + 100;
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//int numero = gerarNumero(1)+1;
		//System.out.println(numero);
		int d = scan.nextInt();
		System.out.println("digite um número: ");
		mostrarNumero(d);
		
		
	}
}
