package componentesconcretos;

import componente.Cafezinho;

public class Expresso extends Cafezinho {
	public Expresso() {
		descricao = "Caf� Expresso"; 
	}
	public double custo() {
		return 3.00;
	}
}
