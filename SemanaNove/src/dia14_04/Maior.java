package dia14_04;

public class Maior {
	public static void main(String[] args) {
		double a = 5.15;
		double b = 12.25;
		double c = 12.85;
		
		double maior = Math.max(a, b);
		System.out.println("O número maior é: " + maior);
		maior = Math.max(maior , c);
		System.out.println("O número maior é: " + maior);
		
		
		double ar = Math.round(b);
		System.out.println(" "+ b + " =  " + ar);
		ar = Math.round(c);
		System.out.println(" "+ c + " =  " + ar);
		
		
	}
}
