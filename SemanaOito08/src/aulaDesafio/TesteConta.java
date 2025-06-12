package aulaDesafio;
import java.util.Scanner;
public class TesteConta {
	
	public static void main(String[] args) {	
	
		Scanner scan = new Scanner(System.in);
		ContaUsuario conta = new ContaUsuario();
		
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Digite sua senha: ");
		String senha = scan.nextLine();
	
		conta.criarConta(nome, senha);
		conta.visualizarConta();
		
		int opcao = 0;
		while (opcao != 3) {
			System.out.println("----MENU----");
			System.out.println("1- Visualizar Conta");
			System.out.println("2- Mudar Senha");
			System.out.println("3- Sair");
			opcao = scan.nextInt();
			
			switch (opcao) {
				case 1:
					conta.visualizarConta();
					break;
				case 2:
					System.out.println("Digite a nova senha: ");
					String novaSenha = scan.nextLine();
					conta.mudarSenha(novaSenha);
					//conta.visualizarConta();
					break;
				case 3:
					System.out.println("Saindo");
					break;
				default:
					System.out.println("Opção Inválida");
			}
		}

	}
	
}
