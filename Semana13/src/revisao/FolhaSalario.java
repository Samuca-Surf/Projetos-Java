package revisao;
	// Dia 12/05/2025
import java.util.Scanner;
public class FolhaSalario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double horasTrabalhadas;
		double salarioHora;
		double salarioTotal;
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.print("Digite seu número de horas trabalhadas: ");
		horasTrabalhadas= sc.nextDouble();
		System.out.print("Digite seu salário por hora: ");
		salarioHora = sc.nextDouble();
		
		salarioTotal = horasTrabalhadas * salarioHora;
		System.out.println("FUNCIONÁRIO:\t " + nome + "\t SALÁRIO\t" + salarioTotal);
		
		sc.close();
	}
}
