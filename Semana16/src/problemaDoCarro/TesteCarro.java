package problemaDoCarro;
import java.util.Scanner;
public class TesteCarro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o modelo: ");
		String modelo = sc.nextLine();
		System.out.print("Digite a cor: ");
		String cor = sc.nextLine();
		System.out.print("Digite o ano de fabricação: ");
		int ano = sc.nextInt();
		
		Carro novoCarro = new Carro(modelo,cor,ano);
		
		System.out.println(novoCarro.obterDescricao());
		if (novoCarro.ehAntigo()) {
			System.out.println("O carro é antigo.");
		}else {
			System.out.println("O carro é novo.");
		}	
		sc.close();
	}
}