package aula31;
import java.util.*;

public class ExercicioQuatro {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<String> clientes = new ArrayList<>();
		
		while(true) {
			System.out.println("Digite o nome do cliente (ou 'sair'): ");
			String nome = sc.nextLine();
			if (nome.equalsIgnoreCase("sair")) break;
			clientes.add(nome);
			
		}
		System.out.println("Clientes cadastrados: ");
		for(String cliente : clientes) {
			System.out.println("-" + cliente);
		}
		System.out.println("Total de Clientes: " + clientes.size());
	}
}
