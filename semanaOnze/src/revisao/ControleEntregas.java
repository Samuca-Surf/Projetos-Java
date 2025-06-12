package revisao;

public class ControleEntregas {
	public double valorTotal;
	public int totalEntregas;
	
	public ControleEntregas() {
		this.totalEntregas = 0;
		this.valorTotal = 0;
	}
	
	
	public void registrarEntrega(String nome , double valorEntrega) {
		if (valorEntrega < 0 ) {
			System.out.println("Valor Inválido");
		}else {
			valorTotal = valorTotal + valorEntrega;
			totalEntregas++;
			System.out.println("Entrega Registrada");
		}
		
	}
	
	public int consultarEntregas() {
		return totalEntregas;
	}
	
	public double consultarValor() {
		return valorTotal;
	}
	
}
