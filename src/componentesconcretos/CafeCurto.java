package componentesconcretos;

import componente.Cafezinho;

public class CafeCurto extends Cafezinho {
	public CafeCurto() {
		descricao = "Caf� curto";
	}
	
	public double custo() {
		return 2.50;
	}
}
