package aula41;

public class TestaPessoa {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(/*"Lorenzo" , 1.75 , 24 , 58.0*/);
		p1.nome = "Lorenzo"; 
		p1.idade = 25;
		p1.exibirPessoa();
		p1.fazAniversario();
		Pessoa p2 = new Pessoa();
		p2.nome = "Davi";
		p2.idade= 36;
		p2.altura=1.85;
		p2.exibirPessoa();
		
	}
}
