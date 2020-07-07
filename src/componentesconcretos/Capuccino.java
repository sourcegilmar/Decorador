package componentesconcretos;

import componente.Cafezinho;

public class Capuccino extends Cafezinho {
	public Capuccino() {
		descricao = "Café capuccino";
	}
	
	public double custo() {
		return 3.50;
	}
}
