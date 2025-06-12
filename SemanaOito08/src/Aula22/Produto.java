package Aula22;

public class Produto {
	public String nome;
	
	public void criarProduto(String nome) {
		this.nome = nome;
		System.out.println("Produto criado com sucesso!");
	}
	
	public void exibirProduto() {
		System.out.println("Nome do produto:  " + this.nome);
	}
}
