package decoradoresconcretos;

import componente.Cafezinho;
import decorador.DecoradorDeCafe;

public class Chocolate  extends DecoradorDeCafe {
	Cafezinho cafezinho;
	public Chocolate(Cafezinho cafezinho) {
		this.cafezinho = cafezinho;
	}
	
	public String getDescricao() {
		return cafezinho.getDescricao()+", DECORADO COM CHOCOLATE";
	}
	
	public double custo() {
		return 2.25+cafezinho.custo();
	}
}
