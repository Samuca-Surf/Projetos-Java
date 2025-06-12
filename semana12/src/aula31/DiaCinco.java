package aula31;
import java.util.ArrayList;
import java.util.Arrays;

public class DiaCinco {
	public static void main(String[] args) {
		// vetor : 
		String colegas[] = {"Davis" , "Kaio" , "Luís" , "Laís" , "Otávio"};
		
		System.out.println(colegas[2]);
	
		
		// lista ou arrayList :
		ArrayList<String> listaColegas = new ArrayList<String>(Arrays.asList(
				"Otávio" , "Laís" , "Luís" , "Kaio" , "Davi"));
		  //        0         1       2         3        4 
		
		System.out.println(listaColegas);
		System.out.println("Posição(2): " +listaColegas.get(2));
		
		listaColegas.add(2 , "Eduardo"); //Adiciona na lista( utilizando a posição , String);
		System.out.println("Nova Posição(2): " + listaColegas.get(2));

		listaColegas.add("Erick"); // Adicionar na lista(como não foi especificado a posição, fica o final);
		System.out.println("Lista:\n   " + listaColegas);
		
		listaColegas.remove(6); // Remover após a posição:
		System.out.println("Lista após remoção de (6):\n "+listaColegas);
		
		listaColegas.remove("Otávio"); //remover usando a String 
		System.out.println("remoção de Otávio:\n " + listaColegas);
		
		listaColegas.set(1, "Otávio");
		System.out.println("colocar Otávio em posição(1):\n "+listaColegas);
		
		System.out.println("Quantos tem na lista:\n	" + listaColegas.size());	//
		
		System.out.println(listaColegas.contains("Laís")); // Descobrir se tem "Laís" (true || false) ;
		
		System.out.println(listaColegas.indexOf("Laís")); //Decobrir em que posição está;
		
		listaColegas.trimToSize(); //"Bloqueia" no tamanho atual;
		
		listaColegas.clear(); // Apagar a lista; 
		System.out.println("Após apagar a lista:\n "+listaColegas);
		
		
	}
}
