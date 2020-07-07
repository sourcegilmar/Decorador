/*
 * Modified and written by: Professor Gilmar Borba, for
 * design patterns classes.
 * 
 * Based upon: Use a cabeça com padrões de projeto, 2a. ed
 *             Eric Freeman & Elizabeth Freeman 
 *       
 * 
 *                        Cafezinho
 *                      ------+------
 *                            |
 * ---------------------------+-----------------------
 * CafeCurto     Capuccino   Expresso  DecoradorDeCafe
 *                                     -------+-------
 *                                            |       
 *                         -------------------+----------------------  
 *                         Canela   Chocolate   Cravo    Leite   Soja
 * 
 */
package componente;
public abstract class Cafezinho {
	protected String descricao = "Bebida básica sem nenhum ingrediente";
	 public String getDescricao() {
	        return descricao;
	    }
	    public abstract double custo();
}
