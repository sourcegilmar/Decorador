package decoradoresconcretos;

import componente.Cafezinho;
import decorador.DecoradorDeCafe;

public class Leite extends DecoradorDeCafe {
	Cafezinho cafezinho;
	
	public Leite(Cafezinho cafezinho) {
		this.cafezinho = cafezinho;
	}
	
	public String getDescricao() {
		 return cafezinho.getDescricao()+", DECORADO COM LEITE";
	}
	
	public double custo() {
		return 1.0 + cafezinho.custo();
	}
}
