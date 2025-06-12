package aulaDesafio;

public class ContaUsuario {
	private String nome;
	private String senha;
	
	public void criarConta(String nome, String senha) { 
		this.nome = nome;
		this.senha = senha;
		System.out.println("Conta criada para " + nome);
	}
	
	public void visualizarConta() {
		System.out.println("Nome de usuario: " + this.nome);
		System.out.println("Senha: " + this.senha);
	}
	
	public void mudarSenha(String novaSenha) {
		this.senha = novaSenha;
		System.out.println("Senha alterada com sucesso");
	}
}
