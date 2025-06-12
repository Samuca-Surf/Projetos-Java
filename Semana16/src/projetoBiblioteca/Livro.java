package projetoBiblioteca;

public class Livro {
	//título, autor, ano de publicação, ISBN(código de barras);
	//cadastrar e exibir novos livros;
	String titulo;
	String autor;
	int anoPub;
	int isbn;
	
	//CONSTRUTOR
	public Livro(String titulo, String autor, int anoPub, int isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPub = anoPub;
		this.isbn = isbn;
	}
	
	
	//EXIBIR INFO
	public void mostrarLivro() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano publicado: " + anoPub);
		System.out.println("ISBN: " + isbn);
		System.out.println("--------------------------\n");
	}
	
	
}
