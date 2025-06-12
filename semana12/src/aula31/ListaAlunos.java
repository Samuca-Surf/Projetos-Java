package aula31;
import java.util.*;

public class ListaAlunos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaAlunos = new ArrayList<>();
		
		
		//solicitar quantidade de alunos:
		System.out.println("Quantos alunos vieram: ");
		int qtdAlunos = sc.nextInt();
		sc.nextLine();
		
		
		// solicitar os nomes dos alunos:
		for (int i=0 ; i < qtdAlunos ; i++) {
			System.out.print("Digite o nome do aluno " + (i+1) + ":  ");
			String nome = sc.nextLine();
			listaAlunos.add(nome);
		}
		
		
		// exibir alunos:
		System.out.println("Lista dos presentes: ");
		for (String aluno : listaAlunos) {
			System.out.println("	" + aluno);
		}
		System.out.println(" Total de presentes:  " +listaAlunos.size());
		
		
		// buscar aluno:
		System.out.print("Digite o aluno que quer buscar: ");
		String alunoBuscado = sc.nextLine();
		if(listaAlunos.contains(alunoBuscado)) {
			System.out.println(alunoBuscado + " Esteve presente");
		}else {
			System.out.println(alunoBuscado + " Não esteve presente");
		}
		
		sc.close();
		
	}
}
