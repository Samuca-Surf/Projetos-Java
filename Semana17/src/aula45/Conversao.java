package aula45;

public class Conversao {
	public static void main(String[] args) {
		//conversao String -> int
		System.out.println("	:String -> int:	");
		String texto = "123";
		int numero = Integer.parseInt(texto);
		System.out.println(numero);
		System.out.println("");
		
		//String -> double
		System.out.println("	:String -> double:	");
		String outroTexto = "45.99";
		double valor = Double.parseDouble(outroTexto);
		System.out.println(valor);
		System.out.println(valor + 10.0);
		System.out.println("");
		
		//int -> String
		System.out.println("	:int -> String:	");
		int num = 25;
		String numTexto = String.valueOf(num);
		System.out.println(numTexto);
		System.out.println(numTexto +"  "+ 22);
		System.out.println(" ");
		
		//int -> double
		System.out.println("	:int -> double:	");
		int num1 = 5;
		double resultado = (double) num1;
		System.out.println(resultado);
		System.out.println("");
		
		//double -> int
		System.out.println("	:double -> int:	");
		double valor1 = 9.9;
		int inteiro = (int) valor1;
		System.out.println(inteiro);
		
		//double -> int (Arrendondando)
		System.out.println("	:double -> int (Arrendondar):	");
		double val = 9.9;
		int in = (int) Math.round(val);
		System.out.println(in);
	
	}
}
