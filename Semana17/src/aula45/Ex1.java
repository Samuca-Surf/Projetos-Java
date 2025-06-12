package aula45;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número:  ");
		String leitura = sc.nextLine();
		
		int numero = Integer.parseInt(leitura);
		
		if (numero % 2 == 0 ) {
			System.out.println("é par");
		}else {
			System.out.print("é impar");
		}
	/*para que se usar:
	evitar bugs de quebra de linha;
	Análize das entradas de dados;
	converter para outros tipos de dados;	
	*/	
		sc.close();
	}
}
