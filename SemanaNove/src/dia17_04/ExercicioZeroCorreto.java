package dia17_04;
import java.util.Scanner;

public class ExercicioZeroCorreto {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o comprimento da mesa:  ");
		double comprimento = scan.nextDouble();
		System.out.print("Digite a largura da mesa:  ");
		double largura = scan.nextDouble();
		
		System.out.print("Digite o número de gavetas:  ");
		int gaveta =scan.nextInt();
		scan.nextLine();
		System.out.print("Escolha: mogno ou carvalho::  ");
		String tipoMadeira = scan.nextLine();
		
		double preco = calcularPreco(comprimento , largura , gaveta , tipoMadeira);
		
		System.out.println("A mesa custará R$" + preco);
		
	}
	
	
	public static double calcularPreco(double comprimento , double largura , int gavetas , String tipoMadeira ) {
		double precoMin = 200;
		double custoMetro = 100;
		
		double area = comprimento * largura;
		
		
		double acrescimoArea = (area > 2) ? 50 : 0; //condição de acrescimo (simplificado?); 
		
		double custoMadeira = 0;
		
		if(tipoMadeira.equalsIgnoreCase("mogno")) {
			custoMadeira = 150;
		}else if(tipoMadeira.equalsIgnoreCase("carvalho")) {
			custoMadeira = 125;
		}
		double custoGavetas = 30 * gavetas;
		
		double precoTotal = precoMin + (area * custoMetro) + acrescimoArea + custoMadeira + custoGavetas;
		return precoTotal;
		
	}
	
}
