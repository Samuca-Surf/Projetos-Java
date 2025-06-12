package aula31;
import java.util.*;

public class ListaTarefas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> tarefas = new ArrayList<>();
		tarefas.add("Estudar Java");
		tarefas.add("Fazer Exercicios");
		tarefas.add("Revisar as provas");
		
		
		System.out.println("Adicione as tres nova tarefas: ");
		for (int i = 0 ; i < 3; i++) {
			tarefas.add(sc.nextLine());
		}
		
		
		for(String tarefa : tarefas) 
		{
			System.out.println("Tarefa: " + tarefa);
		}
		sc.close();
		
	}
}
