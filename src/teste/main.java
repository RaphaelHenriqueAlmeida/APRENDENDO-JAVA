package teste;

public class main {
	
	public static void main(String[] args) {
		System.out.println("Teste");
		
		int corte = 2016;
		int casamento = 2019;
		int tempo = 0;
			
        tempo = subtracao (casamento, corte);
        System.out.println(tempo);
				
		
	}

	private static int subtracao(int corte, int casamento) {
		
		return corte - casamento;
	}

}
