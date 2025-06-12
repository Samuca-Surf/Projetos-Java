package aula42;

public class Pessoa {
	String nome;
	int idade;
	
	////////////CONSTRUTOR//////////////
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//////////MÉTODO VAZIO//////////////	
	public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}
