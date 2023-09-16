package calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraJUnitTeste {

	// TESTE ADIÇÃO
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

	// Realizado os testes de adição não foi notado nenhuma irregularidade.

	// TESTE SUBTRAÇÃO
	@Test
	public void CalculadoraJUnitSub1() {
		Calculadora calc = new Calculadora();

		// Teste 1: Subtração de dois inteiros positivos.
		int ResultSub = calc.sub(5, 3);
		Assert.assertEquals(5, ResultSub);
	}

	@Test
	public void CalculadoraJUnitSub2() {
		Calculadora calc = new Calculadora();

		// Teste 2: Subtração de inteiro positivo e negativo.*
		int ResultSub = calc.sub(5, -3);
		Assert.assertEquals(5, ResultSub);
	}

	@Test
	public void CalculadoraJUnitSub3() {
		Calculadora calc = new Calculadora();

		// Teste 3: Subtração de um inteiro positivo e 0.
		int ResultSub = calc.sub(5, 0);
		Assert.assertEquals(5, ResultSub);
	}

	@Test
	public void CalculadoraJUnitSub4() {
		Calculadora calc = new Calculadora();

		// Teste 4: Subtração de dois 0.
		int ResultSub = calc.sub(0, 0);
		Assert.assertEquals(5, ResultSub);
	}

	// Realizado os testes de subtração não foi notado nenhuma irregularidade.

	// TESTE MULTIPLICAÇÃO
	@Test
	public void CalculadoraJUnitMult1() {
		Calculadora calc = new Calculadora();

		// Teste 1: Multiplicação de dois inteiros positivos.
		int ResultMult = calc.mult(5, 3);
		Assert.assertEquals(5, ResultMult);
	}

	@Test
	public void CalculadoraJUnitMult2() {
		Calculadora calc = new Calculadora();

		// Teste 2: Multiplicação de inteiro positivo e negativo.*
		int ResultMult = calc.mult(5, -3);
		Assert.assertEquals(5, ResultMult);
	}

	@Test
	public void CalculadoraJUnitMult3() {
		Calculadora calc = new Calculadora();

		// Teste 3: Multiplicação de um inteiro positivo e 0.
		int ResultMult = calc.mult(5, 0);
		Assert.assertEquals(5, ResultMult);
	}

	@Test
	public void CalculadoraJUnitMult4() {
		Calculadora calc = new Calculadora();

		// Teste 4: Multiplicação de dois 0.
		int ResultMult = calc.mult(0, 0);
		Assert.assertEquals(5, ResultMult);
	}

	// Realizado os testes de multiplicação não foi notado nenhuma irregularidade.

	// TESTE DIVISÃO
	@Test
	public void CalculadoraJUnitDiv1() {
		Calculadora calc = new Calculadora();

		// Teste 1: Divisão de dois inteiros positivos.
		int ResultDiv = calc.div(10, 3);
		Assert.assertEquals(5, ResultDiv);
	}

	@Test
	public void CalculadoraJUnitDiv2() {
		Calculadora calc = new Calculadora();

		// Teste 2: Divisão de inteiro positivo e negativo.
		int ResultDiv = calc.div(10, -3);
		Assert.assertEquals(5, ResultDiv);
	}

	@Test
	public void CalculadoraJUnitDiv3() {
		Calculadora calc = new Calculadora();

		// Teste 3: Divisão de um inteiro positivo e 0.*
		int ResultDiv = calc.div(5, 0);
		Assert.assertEquals(5, ResultDiv);
	}

	@Test
	public void CalculadoraJUnitDiv4() {
		Calculadora calc = new Calculadora();

		// Teste 4: Divisão de dois 0.*
		int ResultDiv = calc.div(0, 0);
		Assert.assertEquals(5, ResultDiv);
	}

	// Testes 1 e 2 OK. Sem anormalidades.
	// *Ao realizar os testes 3 e 4, nota-se que é necessário realizar o tratamento
	// de exceção. Não é possível dividir por 0.

}
