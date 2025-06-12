package ex7;

public class exercicio7 {
	public static void main(String[] args) {
		//primeiro: contar até 3;
		//segundo: até 7;
		//terceiro: até 9;
		
		//primeiro:
		int num = 0;
		
		System.out.println("Numero usando o while: ");
		while(num <= 3) {
			System.out.println("Número:  " + num);
			num++;
		}
		
		num = 0;
		//segundo:
		System.out.println("Número usando for: ");
		for(num = 0 ; num <= 7; num++) {
			System.out.println("Número:  " + num);
		}
		
		num = 0;
		//terceiro:
		System.out.println("Numero usando do-while: ");
		do {
			System.out.println("Número:  " + num);
			num++;
		}while(num <= 9);
	}
}
