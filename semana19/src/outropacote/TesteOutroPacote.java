package outropacote;

import aula50.Funcionario;

public class TesteOutroPacote {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.nome = "José"; //OK public 
		//f.cargo = "Suporte";	ERRO protected
		//f.setor = "TI";	ERRO default
		//f.salario = 2000.0;	ERRO private
	}
}
