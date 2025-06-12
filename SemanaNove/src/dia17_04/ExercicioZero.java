package dia17_04;
import java.util.Scanner;

public class ExercicioZero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Comprimento:  ");
		double comprimento = scan.nextDouble();
		System.out.print("largura:  ");
		double largura = scan.nextDouble();
		
		System.out.print("numero de gavetas:  ");
		int numGavetas = scan.nextInt();
				
		System.out.println("1--	    mogno = 150 " + "\n2--     carvalho = 125");
		int tipoMadeira = scan.nextInt();
		
		calcular(comprimento , largura , numGavetas , tipoMadeira);
		
		scan.close();
	}
	
	public static void calcular(double comprimento ,double largura, int numGavetas, int tipoMadeira) {
		
		int precoGaveta = 30;
		double minMesa = 200;
		
		
		double mQuadrado = comprimento * largura;
		
		
		double custo;

		
		custo = minMesa;

		if (mQuadrado <= 10) {
			custo += 100;
		}
		else 
		{
			custo = custo + (100+50) ;  
		}
		
		
		switch (tipoMadeira) {
			case 1:
				custo = custo +150;
				break;
			case 2:
				custo = custo + 125;
				break;
			default:
				System.out.println("ERROR");
		}
		
		if(numGavetas > 0) {
			custo = custo +(precoGaveta * numGavetas); 
		}else {
			System.out.println("Sem gavetas");
			System.out.println(custo);
		}
		
		System.out.println(custo);
		
		//m2 é de 100;
		// 1 m2 = 10.000;
		
		

	}
}
