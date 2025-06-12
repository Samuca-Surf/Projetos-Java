package aula31;
import java.util.*;
public class Exemplos {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(-1);
		numeros.remove(1);
		
		System.out.println(numeros.size());
		System.out.println(numeros);
		
	}
}
