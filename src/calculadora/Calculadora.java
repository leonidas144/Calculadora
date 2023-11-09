package calculadora;

/**
 * @author Leônidas Alvarenga
 * @version 1.03
 * @since Release 1.01 da aplicação
 * 
 * Classe que realiza operações matemáticas básicas como adição, subtração,
 * multiplicação e divisão.
 */

public class Calculadora {
	
	/**
	 * Realiza operação de adição.
	 * @param a O primeiro elemento da operação.
	 * @param b O segundo elemento da operação.
	 * @return Retorna o resultado da operação.
	 */
	public int soma (int a, int b) {
		return a + b;
	}
	
	/**
	 * Realiza operação de subtração.
	 * @param a O primeiro elemento da operação.
	 * @param b O segundo elemento da operação.
	 * @return Retorna o resultado da operação.
	 */
	public int sub (int a, int b) {
		return a - b;
	}
	
	/**
	 * Realiza operação de multiplicação.
	 * @param a O primeiro elemento da operação.
	 * @param b O segundo elemento da operação.
	 * @return Retorna o resultado da operação.
	 */
	public int mult (int a, int b) {
		return a * b;
	}
	
	/**
	 * Realiza operação de divisão.
	 * @param a O primeiro elemento da operação.
	 * @param b O segundo elemento da operação.
	 * @return Retorna o resultado da operação.
	 */
	public int div (int a, int b) {
		return a / b;
	}

}
