package calculadora;

/**
 * @author Le�nidas Alvarenga
 * @version 1.03
 * @since Release 1.01 da aplica��o
 * 
 * Classe que realiza opera��es matem�ticas b�sicas como adi��o, subtra��o,
 * multiplica��o e divis�o.
 */

public class Calculadora {
	
	/**
	 * Realiza opera��o de adi��o.
	 * @param a O primeiro elemento da opera��o.
	 * @param b O segundo elemento da opera��o.
	 * @return Retorna o resultado da opera��o.
	 */
	public int soma (int a, int b) {
		return a + b;
	}
	
	/**
	 * Realiza opera��o de subtra��o.
	 * @param a O primeiro elemento da opera��o.
	 * @param b O segundo elemento da opera��o.
	 * @return Retorna o resultado da opera��o.
	 */
	public int sub (int a, int b) {
		return a - b;
	}
	
	/**
	 * Realiza opera��o de multiplica��o.
	 * @param a O primeiro elemento da opera��o.
	 * @param b O segundo elemento da opera��o.
	 * @return Retorna o resultado da opera��o.
	 */
	public int mult (int a, int b) {
		return a * b;
	}
	
	/**
	 * Realiza opera��o de divis�o.
	 * @param a O primeiro elemento da opera��o.
	 * @param b O segundo elemento da opera��o.
	 * @return Retorna o resultado da opera��o.
	 */
	public int div (int a, int b) {
		return a / b;
	}

}
