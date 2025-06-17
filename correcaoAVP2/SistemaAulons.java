package correcaoAVP2;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaAulons {
	
	public static void calcularMediaGeral(ArrayList<Aluno> listaAlunos) {
		if (listaAlunos.isEmpty()) {
			//se a listaAlunos.está vazia?
			System.out.println("Não tem como calcular média ");
			return;
		}
		double soma = 0;
		for (Aluno al : listaAlunos) {
			soma+=al.calcularMedia();
		}
		double mediaGeral = soma/listaAlunos.size();
		System.out.println(mediaGeral);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<Aluno> listaAlunos = new ArrayList<>();  //q daí cria aluno1, aluno2, aluno3... Está usando o arraylist utilizando a classe Aluno
		
		int op;
		do {
			System.out.println("<-<-<-<-MENU->->->-> ");
			System.out.println("0- sair ");
			System.out.println("1- Cadastrar aluno ");
			System.out.println("2- Consultar aluno ");
			System.out.println("3- Calcular média geral ");
			op = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
				case 0: System.out.println("<<<SAINDO>>>") ; break;
				case 1: 
					if (listaAlunos.size() >= 5) {
						System.out.println("Limite atingido "); break;
					}
					System.out.print("Nome do aluno: ");
					String nome = sc.nextLine();
					System.out.print("Primeira nota: ");
					double nota1 = sc.nextDouble();
					System.out.print("Segunda nota: ");
					double nota2 = sc.nextDouble();
					sc.nextLine();
					
					Aluno novoAluno = new Aluno(nome, nota1, nota2);
					listaAlunos.add(novoAluno);
					System.out.println("Aluno cadastrado");
					break;
					
				case 2:	
					System.out.println("Digite o nome do aluno: ");
					String busca = sc.nextLine();
					boolean encontrado = false;
					/*laço de repetição que pega cada objeto;
					 *aluno da lista de alunos e "joga" para 
					 *a variavel temporaria "a" , 
					 *para realizar alguma ação com ela;*/
					for (Aluno a : listaAlunos) {
						if(a.nome.equalsIgnoreCase(busca)) {
							//equalIgnreCase é o == para valores numeros, o IgnoreCase ignora caso a letra seja maiuscula, minuscula...
							System.out.println("Média: " + a.calcularMedia());
							System.out.println("Situação: " + a.verificarSituacao());
							encontrado = true;
							break;
						}
					}	
					if (!encontrado) {
							System.out.println("Não encontrado");
					}
					
					break;
				case 3: calcularMediaGeral(listaAlunos); break;
				
				default:System.out.println("Opção inválida");
			}
			
		}while(op != 0);
		
		sc.close();
		
	}
}
