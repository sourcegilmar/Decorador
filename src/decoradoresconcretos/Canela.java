package decoradoresconcretos;

import componente.Cafezinho;

public class Canela {
	Cafezinho cafezinho;
	public Canela(Cafezinho cafezinho) {
		this.cafezinho = cafezinho;
	}
	public String getDescricao() {
		return cafezinho.getDescricao()+", DECORADO COM CANELA.";
	}
	public double custo() {
		return 0.50+cafezinho.custo();
	}
}
