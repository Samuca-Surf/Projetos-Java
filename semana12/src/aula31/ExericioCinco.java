package aula31;
import java.util.*;
public class ExericioCinco {
	public static void main(String[] args) {
		// criar Array de vendedores e matriz de vendas;
		// cadastro dos 3 vendedores (array);
		// registrar as vendas (matriz);
		// calcular os totais , o maior , e o melhor vendedor;
		// mostrar os resultados;
		
		
		Scanner sc = new Scanner(System.in);
		String[] nomeVendedor = new String[3];
		double[][] vendas = new double[3][5];
		
		
		// for para nome de vendedores
		for (int i = 0 ; i < nomeVendedor.length ; i++) {
			System.out.println("Digite o nome do vendedor" + (i+1));
			nomeVendedor[i] = sc.nextLine();
			
			// for para vendas
			for (int j=0; j < vendas[i].length ; j++) {
				
			}
		}
		
	}
}
