package dia14_04;
import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite o valor de a: ");
		int a = scan.nextInt();
		System.out.print("Digite o valor de b: ");
		int b = scan.nextInt();
		System.out.print("Digite o valor de c: ");
		int c = scan.nextInt();
		System.out.println(verificar(a, b, c));
		scan.close();
	}
	
	public static boolean verificar(int a,int b,int c) {
		return (a+b>c) && (b+c>a) && (c+a>b);
	}
}
