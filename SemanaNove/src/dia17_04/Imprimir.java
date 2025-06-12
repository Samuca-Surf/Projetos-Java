package dia17_04;
import java.util.Scanner;

public class Imprimir {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero:  ");
		int num = scan.nextInt();
		
		int ant = num-1;
		int suc = num+1;
		
		System.out.println("Seu antecessor é: " + ant+";" + "\nO número é: " + num+";" + "\nSeu sucessor é: " + suc +";");
		
		scan.close();
	}
}
