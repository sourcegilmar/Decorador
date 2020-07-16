package decoradoresconcretos;
import componente.Cafezinho;
import decorador.DecoradorDeCafe;
public class Cravo  extends DecoradorDeCafe {
	Cafezinho cafezinho;
	public Cravo(Cafezinho cafezinho) {
		this.cafezinho = cafezinho;
	}
	
	public String getDescricao() {
		return cafezinho.getDescricao()+", DECORADO COM CRAVO";
	}
	
	public double custo() {
		return 0.75+cafezinho.custo();
	}

}
