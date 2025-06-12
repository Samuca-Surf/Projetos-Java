package pacote;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o tamanho de sua terra:  ");
		double t = scan.nextDouble();	//input d tMnho da terra
		System.out.print("Digite a quantidade de filhos:  ");
		int f = scan.nextInt();	//input de quantidade de filhos
		System.out.print("Digite o valor do metro quadrado: ");
		double valorMq = scan.nextDouble();	//input do valor do metro Quadrado;

		calculoRiqueza(t, f, valorMq);
		scan.close();
	}

	public static void calculoRiqueza(double tamanhoTerra, int qtdFilhos, double valorMetroQuadrado) {
		double valorTotal = tamanhoTerra * valorMetroQuadrado;

		double bonus;
		double porcentagem;
		if (qtdFilhos >= 1 && qtdFilhos <= 3) {
			porcentagem = 0.15;
			bonus = tamanhoTerra * porcentagem;
			valorTotal = bonus + valorTotal;
			System.out.println("O valor total é:  " + valorTotal);
		} else if (qtdFilhos >= 4 && qtdFilhos <= 10) {
			porcentagem = 0.5;
			bonus = tamanhoTerra * porcentagem;
			valorTotal = bonus + valorTotal;
			System.out.println("O valor total é:  " + valorTotal);
		} else if (qtdFilhos > 10) {
			porcentagem = 2;
			bonus = tamanhoTerra * porcentagem;
			valorTotal = bonus + valorTotal;
			System.out.println("O valor total é:  " + valorTotal);
		} else {
			System.out.println(valorTotal);
		}
	}

}