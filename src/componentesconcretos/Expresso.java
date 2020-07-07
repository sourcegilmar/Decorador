package componentesconcretos;

import componente.Cafezinho;

public class Expresso extends Cafezinho {
	public Expresso() {
		descricao = "Café Expresso"; 
	}
	public double custo() {
		return 3.00;
	}
}
