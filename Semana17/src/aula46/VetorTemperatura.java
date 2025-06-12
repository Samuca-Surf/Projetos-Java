package aula46;

import java.util.Arrays;

public class VetorTemperatura {
	public static void main(String[] args) {
		int[] temperaturas = {22,25,23,19,15};			//Outra forma de criar um vetor;	//0, 1, 2 ,3 ,4;
				//int[] outratemperaturaTeste = new int [3];		//Uma forma de criar um vetor;
		temperaturas[2] = 30;
		
		for (int temperatura : temperaturas) {	//para cada elemento em elementos;
			System.out.println(temperatura);
		}
		
		System.out.println(Arrays.toString(temperaturas));
		
				
	}
	
}
