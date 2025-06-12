package aula42;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("José", 30);
		p1.mostrarInfo();
		
		System.out.println();
		
		String nome = "Joana";
		int idade = 25;
		Pessoa p2 = new Pessoa(nome,idade);
		p2.mostrarInfo();
	}

}
