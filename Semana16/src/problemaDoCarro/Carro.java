package problemaDoCarro;

public class Carro {
	String modelo;
	String cor;
	int ano;
	
	public Carro(String modelo, String cor, int ano) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		
	}
	
	public void acelerar() {
		System.out.println("O carro está acelerando");
	}
	
	public String obterDescricao() {
		return "CARRO\nCor["+modelo+"]\nModelo["+cor+"]\nAno["+ano+"]";	
	}
	
	public boolean ehAntigo() {
		int anoAtual = java.time.Year.now().getValue();
		return (anoAtual - ano) > 25;
	}
	
}
