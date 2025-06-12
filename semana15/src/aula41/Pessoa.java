package aula41;

public class Pessoa {
	String nome;
	double altura;
	int idade;
	double peso;
	
	/*public Pessoa(String nome, double altura, int idade, double peso) 
	{
		
	}*/
	
	void exibirPessoa() {
		System.out.println("Nome:  "+this.nome);
		System.out.println("Idade:  "+this.idade);
		System.out.println("Altura:  " + this.altura);
		System.out.println("Peso:  " + this.peso);
	}
	
	void fazAniversario() {
		this.idade++;
		System.out.println("Fez aniversário,  Idade " + this.idade);
	}
	
}