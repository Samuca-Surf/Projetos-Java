package revisao;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		ControleEntregas controle = new ControleEntregas();
		
		int opcao = 0;
		
		do {
			System.out.println("1-	Registrar entrega:	");
			System.out.println("2-	Consultar total de entregas:	");
			System.out.println("3-	Consultar valor total das entrega:	");
			System.out.println("4- 	Sair	");
			
			opcao = scan.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.print("Digite o nome do entregador: ");
					scan.nextLine();
					String nome = scan.nextLine();
					System.out.print("Digite o valor da entrega: ");
					double valorEntrega = scan.nextDouble();
					controle.registrarEntrega(nome , valorEntrega);
					break;
				case 2:
					System.out.println("Total de entregas: " + controle.consultarEntregas());
					break;
				case 3:
					System.out.println("Valor total das entregas: " + controle.consultarValor());
					break;
				case 4:
					System.out.println("~~~~ Saindo ~~~~");
					break;
				default:
					System.out.println("ERROR");
					break;
			}		
			
			
		}while(opcao != 4 );
		
		scan.close();
		
	}
}
