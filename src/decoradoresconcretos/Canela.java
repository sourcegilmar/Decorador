package decoradoresconcretos;

import componente.Cafezinho;
import decorador.DecoradorDeCafe;

public class Canela extends DecoradorDeCafe {
	Cafezinho cafezinho;
	public Canela(Cafezinho cafezinho) {
		this.cafezinho = cafezinho;
	}
	public String getDescricao() {
		return cafezinho.getDescricao()+", DECORADO COM CANELA";
	}
	public double custo() {
		return 0.50+cafezinho.custo();
	}
}
