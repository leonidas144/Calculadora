package calculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		//TESTE ADIÇÃO
		//Teste 1: Soma de dois inteiros positivos.
		int ResultSoma = calc.soma(5, 3);
		System.out.println("Soma de valores positivos.\n" + ResultSoma);
		
		//Teste 2: Soma de dois inteiros positivo e negativo.
		ResultSoma = calc.soma(5, -3);
		System.out.println("Soma de valor positivo e negativo.\n" + ResultSoma);
	
		//Teste 3: Soma de um inteiro positivo e 0.
		ResultSoma = calc.soma(5, 0);
		System.out.println("Soma de valor positivo e 0\n" + ResultSoma);
		
		//Teste 4: Soma de dois 0.
		ResultSoma = calc.soma(0, 0);
		System.out.println("Soma de dois 0\n" + ResultSoma);
		
		//Realizado os testes de adição não foi notado nenhuma irregularidade.  
		
		
		System.out.println();
		
		//TESTE SUBTRAÇÃO
		//Teste 1: Subtração de dois inteiros positivos.
		int ResultSub = calc.sub(5, 3);
		System.out.println("Subtração de valores positivos.\n" + ResultSub);
		
		//Teste 2: Subtração de inteiro positivo e negativo.* 
		ResultSub = calc.sub(5, -3);
		System.out.println("Subtração de valor positivo e negativo.\n" + ResultSub);
		
		//Teste 3: Subtração de um inteiro positivo e 0.
		ResultSub = calc.sub(5, 0);
		System.out.println("Subtração de valor positivo e 0.\n" + ResultSub);
		
		//Teste 4: Subtração de dois 0.
		ResultSub = calc.sub(0, 0);
		System.out.println("Subtração de dois 0.\n" + ResultSub);
			
		//Testes 1, 3 e 4 Ok. Sem anormalidades.
		//*Ao realizar o teste 3 nota-se que a subtração esta incorreta. Aconselho revisar o metódo SUB da classe Calculadora.
		
		System.out.println();
		
		
		//TESTE MULTIPLICAÇÃO
		//Teste 1: Multiplicação de dois inteiros positivos.
		int ResultMult = calc.mult(5, 3);
		System.out.println("Multiplicação de valores positivos.\n" + ResultMult);
				
		//Teste 2: Multiplicação de inteiro positivo e negativo.* 
		ResultMult = calc.mult(5, -3);
		System.out.println("Multiplicação de valor positivo e negativo.\n" + ResultMult);
		
		//Teste 3: Multiplicação de um inteiro positivo e 0.
		ResultMult = calc.mult(5, 0);
		System.out.println("Multiplicação de valor positivo e 0.\n" + ResultMult);
				
		//Teste 4: Multiplicação de dois 0.
		ResultMult = calc.mult(0, 0);
		System.out.println("Multiplicação de dois 0.\n" + ResultMult);
		
		//Realizado os testes de multiplicação não foi notado nenhuma irregularidade.
		
		System.out.println();
		
		//TESTE DIVISÃO
		//Teste 1: Divisão de dois inteiros positivos.
		int ResultDiv = calc.div(10, 3);
		System.out.println("Divisão de valores positivos.\n" + ResultDiv);
				
		//Teste 2: Divisão de inteiro positivo e negativo.
		ResultMult = calc.div(10, -3);
		System.out.println("Divisão de valor positivo e negativo.\n" + ResultDiv);
		
		//Teste 3: Divisão de um inteiro positivo e 0.*
		ResultMult = calc.div(5, 0);
		System.out.println("Divisão de valor positivo e 0.\n" + ResultDiv);
				
		//Teste 4: Divisão de dois 0.*
		ResultMult = calc.div(0, 0);
		System.out.println("Divisão de dois 0.\n" + ResultDiv);
		
		//Testes 1 e 2 OK. Sem anormalidades.
		//*Ao realizar os testes 3 e 4, nota-se que é necessário realizar o tratamento de exceção. Não é possível dividir por 0.
	}

}
