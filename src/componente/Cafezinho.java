/*
 * Modified and written by: Professor Gilmar Borba, for
 * design patterns classes.
 * 
 * Based upon: Use a cabe�a com padr�es de projeto, 2a. ed
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
	protected String descricao = "Bebida b�sica sem nenhum ingrediente";
	 public String getDescricao() {
	        return descricao;
	    }
	    public abstract double custo();
}
