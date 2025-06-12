package dia15_04;
import java.util.Scanner;

public class ReajusteSalario {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite seu salário:    ");
		double salarioAtual = scan.nextDouble();
		
		double novoSalario = calcularSalario(salarioAtual);
		System.out.println("Seu novo salário é: " + novoSalario);
	
		scan.close();
	}
	
	public static double calcularSalario(double salarioAtual) {
		double salarioMin = salarioAtual/1518;
		double reajuste;
		
		if (salarioMin <= 3 ) {
			reajuste = 0.20;
		}else if(salarioMin <= 5) {
			reajuste = 0.15;
		}else {
			reajuste = 0.10;
		}
		
		double novoSalario = salarioAtual + (salarioAtual * reajuste);
		
		double minimo = 1.5 * 1518;
		double maximo = 20 * 1518;
		
		if (novoSalario < minimo) 
		{
			novoSalario = minimo;
		}
		else if (novoSalario > maximo)
		{
			novoSalario = maximo;
		}
		return novoSalario;
	}
	
	
	
/*	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite:  ");
		double s = scan.nextDouble();
		
		System.out.println(reajuste(s));
	
		scan.close();
	}
	
	public static double reajuste(double salario ) 
	{
		
		double salmin = 1518;
		double slmax = salmin*20;
		if ((salario > salmin*1.5) && (salario < slmax )){
			if (salario > (salmin * 3)) {
				return salario = salario + (salario * 0.2);
			}else if((salario > (salmin * 3)) && ((salario <= (salmin*5)))) {
				return salario = salario + (salario*0.15);
			}else {
				return salario = salario + (salario*0.10); 
			}
		}else if (salario < salmin*1.5) {
			salario = salmin;	
		}else if( salario > slmax) {
			salario = slmax;
		}else {
			return  0;
		}

	}	*/
	
}
