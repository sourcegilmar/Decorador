package decoradoresconcretos;

import componente.Cafezinho;
import decorador.DecoradorDeCafe;

public class Soja  extends DecoradorDeCafe {
	Cafezinho cafezinho;
	public Soja(Cafezinho cafezinho) {
		this.cafezinho = cafezinho;
	}
	
	public String getDescricao() {
		return cafezinho.getDescricao()+", DECORADO COM SOJA";
	}
	
	public double custo() {
		return 1.25+cafezinho.custo();
	}

}
