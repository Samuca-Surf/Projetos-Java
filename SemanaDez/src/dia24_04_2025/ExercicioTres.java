package dia24_04_2025;

public class ExercicioTres {
	public static void main(String[] args) 
	{
		int[][] matriz = 
		{
			{1 , 2 , 3},
			{4 , 5 , 6}
		};
		
		int soma = 0;
		for(int[] linha : matriz) 
		{
			for(int coluna : linha) 
			{
				soma = soma + coluna; 
			}
		}
		System.out.println("A soma dará " + soma);
	}
}