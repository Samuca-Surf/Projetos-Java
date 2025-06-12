package aula31;
import java.util.*;

public class ListadeFrutas {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<String> frutas = new ArrayList<>();
		String fruta = "";
		
		System.out.println("Digite uma fruta: \nDigite 'sair' para encerrar.");
		 while(true){
			System.out.print("Fruta: ");
			fruta = sc.nextLine();
			
			if(fruta.equalsIgnoreCase("sair")) { // igual ; ignora se a letra está maiuscula ou minuscula;
				break;
			}
			
			frutas.add(fruta);
		}
		System.out.println("Existe a fruta: " );
		String frutaBuscada = sc.nextLine();
		
		if (frutas.contains(frutaBuscada)) {
			System.out.println("Está na lista");
		}else {
			System.out.println("Não está na lista");
		}
	
		sc.close();
		
		/* 
		System.out.println("FRUTAS: " + frutas);
		System.out.println("Quantidades de frutas: " + frutas.size());
		*/
	}
}
