package aula31;
import java.util.*;

public class ExercicioTres {
	public static void main(String[] args) {
		//		:::PRIMEIRA OPÇÃO::: (eu q fiz)
		/*Scanner sc = new Scanner(System.in);
		double[][] matriz = new double[3][4];
//					notas	double[//ALUNOS][//DISCIPLINA]
		
		double notas;		
		double soma = 0;	
		double media;		
		
		double somaGeral = 0;
		double mediaGeral;
		
		
				
		for (int i = 0; i < 3; i++) {
			soma = 0;
			for (int j = 0 ; j < 4 ; j++) {
				System.out.println("Digite as notas do aluno " + (i+1));
				notas = sc.nextDouble();
				soma = notas + soma;
				
				somaGeral = notas+ somaGeral;
			}
			media = soma/4;
			
			System.out.println("Aluno  "+ (i+1) + "		Média: " + media );
			
		}
		mediaGeral = somaGeral/12;
		System.out.println("Média Geral: " + mediaGeral);
		
		sc.close();
		*/
		
		
		//		:::SEGUNDA OPÇÃO:::
		Scanner sc = new Scanner(System.in); 
		double[][] notas = new double[3][4];
		  double somaTotal = 0; 
		  
		    // for para calcular notas;
		  for(int i =0 ; i <3 ; i++){
			  double somaAluno = 0;
		  		System.out.println("Aluno " + (i+1) + " : ");
		  		for (int j = 0; j < 4 ; j++){
		  			System.out.println("  Nota da disciplina " + (j+1) + " : ");
		  			notas[i][j] = sc.nextDouble();
		  			somaTotal += notas[i][j];
		  			somaAluno += notas[i][j];
		  			
		  		}
		  		System.out.println("Média do aluno " + (i+1) + " : " + somaAluno/4);
		  
		  }
		  
		  System.out.printf("Média Geral: %.2f%n" + somaTotal/12);
			//%.2f = para manter duas casas decimais; %n para formatar uma linha;
		
		
		
		
		
	}
}
