package componentesconcretos;

import componente.Cafezinho;

public class Capuccino extends Cafezinho {
	public Capuccino() {
		descricao = "Caf� capuccino";
	}
	
	public double custo() {
		return 3.50;
	}
}
