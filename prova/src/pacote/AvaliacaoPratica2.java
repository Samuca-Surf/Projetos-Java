package pacote;
import java.util.Scanner;
import java.util.ArrayList;
public class AvaliacaoPratica2 {
	/*registrar alunos do curso de Desenvolvimento de Sistemas, com base em
	seus nomes e as 2 notas das avaliações práticas de Lógica de Programação. O sistema
	precisa calcular a média das notas e indicar a situação de cada aluno.
	Tendo uma média igual ou maior que 7, o aluno está aprovado;
	Caso a média seja menor que 7, mas igual ou maior que 4, o aluno estará de recuperação.
	E caso a média seja menor que 4, está reprovado.
	Sendo assim, como um primeiro protótipo, para testes, a coordenação precisa deste sistema
	para registrar os nomes de no máximo 5 alunos, suas notas, e ter uma maneira de verificar
	a situação de quem foi aprovado, reprovado ou está de recuperação com base na média final.
	Esse protótipo será utilizado para testar um novo modo de gerenciar as notas dos alunos, por
	isso precisa ser claro, funcional e livre de erros.*/
	
	
public static ArrayList<String> alunos = new ArrayList<>();	
public static ArrayList<Double> notasMedia = new ArrayList<>();
//String[] nomes = new String[4];
/*
 * 0 1 2 3 4 
 * 1 1 1 1 1 
 *  
 */
public static Scanner sc = new Scanner (System.in);
public static int contagem=0;
	public static void main(String[] args) {
		int op;
		
		do {
			System.out.println("----MENU----\n0-Sair\n1-Registrar alunos\n2-Médias das notas");
			op = sc.nextInt();
			switch(op) {
				case 0:
				    break;
				case 1:	
					registrar();
					break;
				case 2:	mediaNotas(); break;
				default: System.out.println("ERROR"); break;
			}
			System.out.println("Construtor:  ");
		}while(op != 0);
		
		
	}
	public static double media;
	public static void registrar() {
		double nota1;
		double nota2;
	
		String aluno;
		
		if (contagem <= 5) {
			contagem++;
			System.out.println("Contagem:  " + contagem);
			
			System.out.println("Digite o nome do aluno");
			aluno = sc.next();
			System.out.println("Digite sua primeira nota");
			nota1 = sc.nextDouble();
			System.out.println("Digite segunda nota");
			nota2 = sc.nextDouble();
			media = (nota1+nota2)/2;
			alunos.add(aluno);
			notasMedia.add(media);
			
		}
	}
	
	public static void mediaNotas() {
		for (int i=0; i <= alunos.size(); i++ ) {
				System.out.println("Aluno: " + alunos.get(i)  + "\tNotas: " + notasMedia.get(i));
			
				
				if (media >= 7 ) {
				System.out.println();
			}
		}
		
	}
	
}
