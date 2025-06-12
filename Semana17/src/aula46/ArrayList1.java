package aula46;
import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> temperaturas = new ArrayList<>();
		temperaturas.add(25);
		temperaturas.add(19);
		temperaturas.add(24);
		temperaturas.add(1,23);	//troca a posição 1 de 19 para 23
		temperaturas.add(2,21);
		temperaturas.remove(0);
		System.out.println(temperaturas.get(2));
		System.out.println(temperaturas.size());	
		
		for (int t : temperaturas) {
			System.out.println(t);
		}
		
		
	}
}
