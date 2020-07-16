package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import componente.Cafezinho;
import componentesconcretos.CafeCurto;
import componentesconcretos.Capuccino;
import componentesconcretos.Expresso;
import decoradoresconcretos.Canela;
import decoradoresconcretos.Chocolate;
import decoradoresconcretos.Cravo;
import decoradoresconcretos.Leite;
import decoradoresconcretos.Soja;
public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cafezinho tipoCafe;
		// -----------------------
		String resultado = "";
		int op = 1;
		int opIngrediente = 1;
		String tipoTextoCafe = "";
		// ------------------------
		while (true) {
			int op1;
			System.out.println("CARDÁPIO");
			System.out.println("1 - Café Curto");
			System.out.println("2 - Capuccino");
			System.out.println("3 - Expresso");
			System.out.println("4 - Sair");
			op = sc.nextInt();
			if (op == 1) {
				tipoTextoCafe = " - CAFÉ CURTO:";
				Cafezinho cafe = new CafeCurto();
				menuIngredientes(tipoTextoCafe);
				opIngrediente = sc.nextInt();
				resultado = escolherIngredientes(resultado, opIngrediente, cafe);
				System.out.println(resultado);
			}
			if (op == 2) {
				tipoTextoCafe = " - CAPUCCINO:";
				Cafezinho cafe = new Capuccino();
				menuIngredientes(tipoTextoCafe);
				opIngrediente = sc.nextInt();
				resultado = escolherIngredientes(resultado, opIngrediente, cafe);
				System.out.println(resultado);
			}
			if (op == 3) {
				tipoTextoCafe = " - EXPRESSO:";
				Cafezinho cafe = new Expresso();
				menuIngredientes(tipoTextoCafe);
				opIngrediente = sc.nextInt();
				resultado = escolherIngredientes(resultado, opIngrediente, cafe);
				System.out.println(resultado);
			}
			if (op == 4) {
				break;
			}
			// ---------------- reinicia variáveis
			resultado = "";
			op = 1;
			opIngrediente = 1;
			tipoTextoCafe = "";
			// -----------------------------------
		}
		System.out.println("PROGRAMA FINALIZADO!");
		sc.close();
	}
	public static String escolherIngredientes(String resultado, int opIngrediente, Cafezinho cafe) {
		if (opIngrediente == 1) {
			resultado = resultado + "(1) " + cafe.getDescricao() + "\n -> R$ " + cafe.custo() + "\n";
		}
		if (opIngrediente == 2) {
			cafe = new Canela(cafe);
			resultado = resultado + "\n(2) " + cafe.getDescricao() + "\n -> R$ " + cafe.custo() + "\n";
		}
		if (opIngrediente == 3) {
			cafe = new Chocolate(cafe);
			resultado = resultado + "\n(3) " + cafe.getDescricao() + "\n -> R$ " + cafe.custo() + "\n";
		}
		if (opIngrediente == 4) {
			cafe = new Cravo(cafe);
			resultado = resultado + "\n(4) " + cafe.getDescricao() + "\n -> R$ " + cafe.custo() + "\n";
		}
		if (opIngrediente == 5) {
			cafe = new Leite(cafe);
			resultado = resultado + "\n(5) " + cafe.getDescricao() + "\n -> R$ " + cafe.custo() + "\n";
		}
		if (opIngrediente == 6) {
			cafe = new Soja(cafe);
			resultado = resultado + "\n(6) " + cafe.getDescricao() + "\n -> R$ " + cafe.custo() + "\n";
		}
		if (opIngrediente == 7) {
			cafe = new Canela(cafe);
			cafe = new Leite(cafe);
			resultado = resultado + "\n(7) " + cafe.getDescricao() + "\n -> R$ " + cafe.custo() + "\n";
		}
		if (opIngrediente == 8) {
			cafe = new Chocolate(cafe);
			cafe = new Leite(cafe);
			resultado = resultado + "\n(8) " + cafe.getDescricao() + "\n -> R$ " + cafe.custo() + "\n";
		}
		if (opIngrediente == 9) {
			cafe = new Chocolate(cafe);
			cafe = new Cravo(cafe);
			cafe = new Leite(cafe);
			cafe = new Soja(cafe);
			resultado = resultado + "\n(9) " + cafe.getDescricao() + "\n -> R$ " + cafe.custo() + "\n";
		}
		// << Para incluir novas opções escreva aqui - altere menuIngredientes >>
		return resultado;
	}

	private static void menuIngredientes(String texto) {
		System.out.println("INGREDIENTES" + texto);
		System.out.println("1 - Nenhum");
		System.out.println("2 - Canela");
		System.out.println("3 - Chocolate");
		System.out.println("4 - Cravo");
		System.out.println("5 - Leite");
		System.out.println("6 - Soja");
		System.out.println("7 - Canela e Leite");
		System.out.println("8 - Chocolate, Leite");
		System.out.println("9 - Chocolate, Cravo, Leite e Soja");
		// << Para incluir novas opções escreva aqui - altere método "escolherIngredientes" >>
	}

}
