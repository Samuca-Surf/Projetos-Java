package dia14_04;
import java.util.Scanner;

public class LojaDeTinta {
	//galões 3.6 l = R$25;	 1l d tinta = 18m²(o número inteiro);	se for 0 galão = 1 galão ;	
	//ler area a ser pintada,
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double area = scan.nextDouble();
		int qtdGaloes = calcular(area);
		double preco = qtdGaloes * 25;
		
		
		System.out.println("O número de Galões necessários:  " + qtdGaloes);
		System.out.println("O valor total é:  " + preco);
		scan.close();
	}
	
	public static int calcular(double area ) {
		double areaPorGalao = 18 * 3.6;
		if (area <= 0 ) {
			return 0;
		}else if (area <= areaPorGalao) {
			return 1;
		}else {
			double qtdDeGaloes = area/areaPorGalao;
			return (int)Math.round(qtdDeGaloes);
		}
	}	
}
