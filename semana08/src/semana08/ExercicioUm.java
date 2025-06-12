package semana08;
import java.util.Scanner;
public class ExercicioUm {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float salario;
		int anosTrabalho;
		boolean temDivida;
		
		System.out.print("Digite seu salário: ");
		salario = entrada.nextFloat();
		
		if (salario < 5000 ) {
			System.out.println("Empréstimo recusado. ");
		}else {
			System.out.println("Há quanto tempo você está empregada? ");
			anosTrabalho = entrada.nextInt();
			System.out.println("Você tem dividas atrasadas? ");
			temDivida = entrada.nextBoolean();
			
			if (anosTrabalho >= 4  && temDivida == false) {
				System.out.println("Empréstimo liberado ");
			}else {
				System.out.println("Empréstimo em análise ");
			}
		}
		entrada.close();
	}
}