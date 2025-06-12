package aula45;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<>();
		
		int num;
		do {
			System.out.println("(Digite 0 para sair)");
			System.out.print("Digite um número: ");
			num = Integer.parseInt(sc.nextLine());
			
			if (num != 0) {
				lista.add(num);
				System.out.println("Número adicionado");
			}
		}while (num != 0 );
		
		int soma=0;
		for (int n : lista) {
			soma += n;
		}
		System.out.println(soma);
		sc.close();
		
	}
}
