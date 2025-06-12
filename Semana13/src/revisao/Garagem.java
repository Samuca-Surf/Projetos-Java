package revisao;
import java.util.*;

public class Garagem {
	static ArrayList<String> modelos = new ArrayList<>();
	static ArrayList<Integer> anos = new ArrayList<>();
	static ArrayList<Double> precos = new ArrayList<>();
	static final int maxCarros = 5;
	
	
	public static void cadastrar(Scanner sc) 
	{
		if(modelos.size() >= maxCarros) {
			System.out.println("Limite atingido");
			return;
		}
		System.out.print("Digite o modelo: ");
		String modelo = sc.next();
		System.out.print("Digite o ano de fabricação: ");
		int ano = sc.nextInt();
		System.out.print("Digite o preço: R$");
		double preco = sc.nextDouble();
		
		modelos.add(modelo);
		anos.add(ano);
		precos.add(preco);
		System.out.println("CArro cadastrado! ");
	}
	
	
	
	public static void listar() {
		System.out.println("----LISTA DE CARROS----");
		
		for (int i =0 ; i < modelos.size() ; i++) {
			System.out.println("Modelo: " + modelos.get(i) + 
					"\nAno: " + anos.get(i) + 
					"\nPreço: R$" + precos.get(i) + "\n");
		}
		
	}
	
	
	
	public static void filtrar(Scanner sc) {
		System.out.println("Digite o ano mínimo");
		int anoFiltro = sc.nextInt();
		boolean encontrou = false;
		
		for (int i=0; i<anos.size(); i++) {
			if (anos.get(i) >= anoFiltro) {
				System.out.println("Modelo: " + modelos.get(i)+
						"\nAno: " + anos.get(i) + 
						"\nPreço: " + precos.get(i) + "\n");
				encontrou = true;
			}
		}
		
		if (!encontrou) {
			System.out.println("Nenhum carro enconrado ");
		}
	}
	
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("---- Menu ----\n1 - Cadastrar carro \n2 - Listar todos os carros \n3 - Filtrar por ano \n4 - Sair");
			opcao = sc.nextInt();
			switch(opcao) 
			{
				case 1: cadastrar(sc); break;
				case 2: listar(); break;
				case 3: filtrar(sc); break;
				case 4: System.out.println("Saindo");break;
				default: System.out.println("Inválido");break;
			}
			
		}while(opcao != 4);
		System.out.println("Saiu");
		
		
	}
	
	
	
	
	
}
