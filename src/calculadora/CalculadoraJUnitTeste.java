package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraJUnitTeste {

	// TESTE ADI��O
	@Test
	public void CalculadoraJUnitAdicao1() {
		Calculadora calc = new Calculadora();

		// Teste 1: Soma de dois inteiros positivos.
		int ResultSoma = calc.soma(5, 3);
		Assert.assertEquals(2, ResultSoma);
	}

	@Test
	public void CalculadoraJUnitAdicao2() {
		Calculadora calc = new Calculadora();

		// Teste 2: Soma de dois inteiros positivo e negativo.
		int ResultSoma = calc.soma(5, -3);
		Assert.assertEquals(5, ResultSoma);
	}

	@Test
	public void CalculadoraJUnitAdicao3() {
		Calculadora calc = new Calculadora();

		// Teste 3: Soma de um inteiro positivo e 0.
		int ResultSoma = calc.soma(5, 0);
		Assert.assertEquals(5, ResultSoma);
	}

	@Test
	public void CalculadoraJUnitAdicao4() {
		Calculadora calc = new Calculadora();

		// Teste 4: Soma de dois 0.
		int ResultSoma = calc.soma(0, 0);
		Assert.assertEquals(5, ResultSoma);
	}

	// Realizado os testes de adi��o n�o foi notado nenhuma irregularidade.

	// TESTE SUBTRA��O
	@Test
	public void CalculadoraJUnitSub1() {
		Calculadora calc = new Calculadora();

		// Teste 1: Subtra��o de dois inteiros positivos.
		int ResultSub = calc.sub(5, 3);
		Assert.assertEquals(5, ResultSub);
	}

	@Test
	public void CalculadoraJUnitSub2() {
		Calculadora calc = new Calculadora();

		// Teste 2: Subtra��o de inteiro positivo e negativo.*
		int ResultSub = calc.sub(5, -3);
		Assert.assertEquals(5, ResultSub);
	}

	@Test
	public void CalculadoraJUnitSub3() {
		Calculadora calc = new Calculadora();

		// Teste 3: Subtra��o de um inteiro positivo e 0.
		int ResultSub = calc.sub(5, 0);
		Assert.assertEquals(5, ResultSub);
	}

	@Test
	public void CalculadoraJUnitSub4() {
		Calculadora calc = new Calculadora();

		// Teste 4: Subtra��o de dois 0.
		int ResultSub = calc.sub(0, 0);
		Assert.assertEquals(5, ResultSub);
	}

	// Realizado os testes de subtra��o n�o foi notado nenhuma irregularidade.

	// TESTE MULTIPLICA��O
	@Test
	public void CalculadoraJUnitMult1() {
		Calculadora calc = new Calculadora();

		// Teste 1: Multiplica��o de dois inteiros positivos.
		int ResultMult = calc.mult(5, 3);
		Assert.assertEquals(5, ResultMult);
	}

	@Test
	public void CalculadoraJUnitMult2() {
		Calculadora calc = new Calculadora();

		// Teste 2: Multiplica��o de inteiro positivo e negativo.*
		int ResultMult = calc.mult(5, -3);
		Assert.assertEquals(5, ResultMult);
	}

	@Test
	public void CalculadoraJUnitMult3() {
		Calculadora calc = new Calculadora();

		// Teste 3: Multiplica��o de um inteiro positivo e 0.
		int ResultMult = calc.mult(5, 0);
		Assert.assertEquals(5, ResultMult);
	}

	@Test
	public void CalculadoraJUnitMult4() {
		Calculadora calc = new Calculadora();

		// Teste 4: Multiplica��o de dois 0.
		int ResultMult = calc.mult(0, 0);
		Assert.assertEquals(5, ResultMult);
	}

	// Realizado os testes de multiplica��o n�o foi notado nenhuma irregularidade.

	// TESTE DIVIS�O
	@Test
	public void CalculadoraJUnitDiv1() {
		Calculadora calc = new Calculadora();

		// Teste 1: Divis�o de dois inteiros positivos.
		int ResultDiv = calc.div(10, 3);
		Assert.assertEquals(5, ResultDiv);
	}

	@Test
	public void CalculadoraJUnitDiv2() {
		Calculadora calc = new Calculadora();

		// Teste 2: Divis�o de inteiro positivo e negativo.
		int ResultDiv = calc.div(10, -3);
		Assert.assertEquals(5, ResultDiv);
	}

	@Test
	public void CalculadoraJUnitDiv3() {
		Calculadora calc = new Calculadora();

		// Teste 3: Divis�o de um inteiro positivo e 0.*
		int ResultDiv = calc.div(5, 0);
		Assert.assertEquals(5, ResultDiv);
	}

	@Test
	public void CalculadoraJUnitDiv4() {
		Calculadora calc = new Calculadora();

		// Teste 4: Divis�o de dois 0.*
		int ResultDiv = calc.div(0, 0);
		Assert.assertEquals(5, ResultDiv);
	}

	// Testes 1 e 2 OK. Sem anormalidades.
	// *Ao realizar os testes 3 e 4, nota-se que � necess�rio realizar o tratamento
	// de exce��o. N�o � poss�vel dividir por 0.

}
