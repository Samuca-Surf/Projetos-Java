package aula50;

public class TesteMesmoPacote {
	
	public static void main(String[] args) {
		Funcionario f= new Funcionario();
		f.nome = "Ana";	//OK public
		f.cargo="Analista";	//OK protected
		f.setor = "TI";	//OK default
		//f.salario = 2000.0;	ERRO private
		f.mostrarDados();
	}
}
