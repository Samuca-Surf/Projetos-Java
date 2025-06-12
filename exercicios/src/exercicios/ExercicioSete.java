package exercicios;

public class ExercicioSete {
	public static void main(String[] args) {
		//1 a 100, soma total;
		int soma = 0;
		for ( int i=1 ; i <= 100 ; i++){
			soma = i+ soma;
			System.out.println(soma);
		}
		System.out.println("A soma total é: " + soma);
	}
}
