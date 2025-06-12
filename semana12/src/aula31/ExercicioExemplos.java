package aula31;
import java.util.ArrayList;
import java.util.Arrays;
public class ExercicioExemplos {
	public static void main(String[] args) {
		//	VETOR
		String[]  carros = {"Eclipse Cross","Corolla", "HR-V", "Skyline", "Fusca", "Civic"};
		//							0			1		  2		   3		 4		  5
		carros[0] = "Kombi";
		
		System.out.println(carros[0]);
		
		
		
		
		//	MATRIZ		
		//	//	//	// // //Coluna0 , //Coluna1	//	//	//	//	//	//	//	//	//
		String[][] carro = {{"Celta" , "Palio"},		//Linha0
			/*Linha1*/		{"Mustang","Ferrari"},
			/*Linha2*/		{"Camaro","Brazilia"}};
		
		System.out.println(carro[0][1]);
						//carro[Linha][Coluna]
		
		
		
		
		//	LISTA:
		ArrayList<String> listaCarros = new ArrayList<>();
		listaCarros.addAll(Arrays.asList("Cherry" , "Ka", "Renegade" , "Onix"));
		//									0		 1		  2		 	 3
		System.out.println(listaCarros.get(1));
	}
}
