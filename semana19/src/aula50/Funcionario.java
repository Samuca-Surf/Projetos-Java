package aula50;


public class Funcionario {
	public String nome; //acessível em qualquer lugar;
	protected String cargo; //no mesmo pacote e subclasses;
	String setor; //acessível dentro do mesmo pacote;
	private double salario; //acessível apenas na própria classe
	
	public void mostrarDados() {
		System.out.println("Nome "+ nome);
		System.out.println("Cargo "+ cargo);
		System.out.println("Setor "+ setor);
		System.out.println("Salário "+ salario);
		
	}
	
	
}