package aula31;
import java.util.*;

public class ListaCidades {
	public static void main(String[] args) {
		ArrayList<String> cidades = new ArrayList<String>();
		cidades.add("Natal");
		cidades.add("Floripa");
		cidades.add("Tubarão");
		cidades.add("Anta Gorda");
		cidades.add("Portão");
		cidades.add(0 , "Imbituba");
		
		System.out.println("	PRIMEIRO FOR:	");
		for(int i = 0 ; i < cidades.size(); i++ ) {
			System.out.println(cidades.get(i));
		}
		System.out.println("	SEGUNDO FOR:	");
		for(String i : cidades) {
			System.out.println(i);
		}
	}
}
