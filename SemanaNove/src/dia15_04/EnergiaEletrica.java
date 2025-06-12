package dia15_04;


public class EnergiaEletrica {
	
	public static void consumo(double faixaConsumo) {
		int consumo = 120;
		
		double custo ;
		
		if (consumo <= 30) {
			custo = consumo*0.09556;
		}else if(consumo < 100)
		{
			custo = ((30*0.09556)+(consumo-30)*0.16690);
			
		}else if (consumo <= 200) {
			custo = ((30*0.09556)+(70*0.16690)+(consumo - 100)+0.25012);
		}
		
		
	}
	
}
