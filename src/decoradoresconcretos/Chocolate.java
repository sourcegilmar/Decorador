package decoradoresconcretos;

import componente.Cafezinho;

public class Chocolate {
	Cafezinho cafezinho;
	public Chocolate(Cafezinho cafezinho) {
		this.cafezinho = cafezinho;
	}
	
	public String getDescricao() {
		return cafezinho.getDescricao()+", DECORADO COM CHOCOLATE.";
	}
	
	public double custo() {
		return 2.25+cafezinho.custo();
	}
}
