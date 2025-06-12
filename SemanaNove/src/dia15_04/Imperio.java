package dia15_04;
import java.util.Scanner;

public class Imperio {
	//input.	tempo de Contribuição		Porcentual a ser recebido
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu tempo de contribuição:  ");
		int anos = scan.nextInt();
		
		System.out.println("Digite seu salário:  ");
		double s = scan.nextDouble();
		
		
		calcular(anos , s);
		scan.close();
	}
		
	public static void calcular(int tempoContribuicao , double salario ) 
	{
		double porcentualASerRecebido;
		if(tempoContribuicao >= 0 && tempoContribuicao <= 24) 
		{
			porcentualASerRecebido = 0;
			System.out.println("Não terá porcentrual a ser recebido ");
		}else if(tempoContribuicao >= 25 && tempoContribuicao <= 30) 
		{
			porcentualASerRecebido = 0.60;
			double p = porcentualASerRecebido * salario;
			salario = salario + p;
			System.out.println("porcentual a ser recebido será de: 60%");
			System.out.println(salario);
		}else if(tempoContribuicao >= 31 && tempoContribuicao <= 35) {
			
			porcentualASerRecebido = 0.70;

			double p = porcentualASerRecebido * salario;
			salario = salario + p;
			System.out.println("porcentual a ser recebido será de: 70%");
			System.out.println(salario);
		}else if(tempoContribuicao >= 36 && tempoContribuicao <= 40) {
			
			porcentualASerRecebido = 0.80;
			
			double p = porcentualASerRecebido * salario;
			salario = salario + p;
			System.out.println("porcentual a ser recebido será de: 80%");
			System.out.println(salario);
		}else if(tempoContribuicao >=41 && tempoContribuicao <= 45) {
			porcentualASerRecebido = 0.90;
			
			double p = porcentualASerRecebido * salario;
			salario = salario + p;
			System.out.println("porcentual a ser recebido será de: 90%");
			System.out.println(salario);
			
		}else if(tempoContribuicao > 45 && tempoContribuicao <= 80) {
			porcentualASerRecebido = 1;
			
			double p = porcentualASerRecebido * salario;
			salario = salario + p;
			System.out.println("porcentual a ser recebido será de: 100%");
			System.out.println(salario);
			
		}else {
			System.out.println("Valor inválido ");
		}
		
	}
	
	
}
