package calculadora;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		//TESTE ADI��O
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
		
		//Realizado os testes de adi��o n�o foi notado nenhuma irregularidade.  
		
		
		System.out.println();
		
		//TESTE SUBTRA��O
		//Teste 1: Subtra��o de dois inteiros positivos.
		int ResultSub = calc.sub(5, 3);
		System.out.println("Subtra��o de valores positivos.\n" + ResultSub);
		
		//Teste 2: Subtra��o de inteiro positivo e negativo.* 
		ResultSub = calc.sub(5, -3);
		System.out.println("Subtra��o de valor positivo e negativo.\n" + ResultSub);
		
		//Teste 3: Subtra��o de um inteiro positivo e 0.
		ResultSub = calc.sub(5, 0);
		System.out.println("Subtra��o de valor positivo e 0.\n" + ResultSub);
		
		//Teste 4: Subtra��o de dois 0.
		ResultSub = calc.sub(0, 0);
		System.out.println("Subtra��o de dois 0.\n" + ResultSub);
			
		//Testes 1, 3 e 4 Ok. Sem anormalidades.
		//*Ao realizar o teste 3 nota-se que a subtra��o esta incorreta. Aconselho revisar o met�do SUB da classe Calculadora.
		
		System.out.println();
		
		
		//TESTE MULTIPLICA��O
		//Teste 1: Multiplica��o de dois inteiros positivos.
		int ResultMult = calc.mult(5, 3);
		System.out.println("Multiplica��o de valores positivos.\n" + ResultMult);
				
		//Teste 2: Multiplica��o de inteiro positivo e negativo.* 
		ResultMult = calc.mult(5, -3);
		System.out.println("Multiplica��o de valor positivo e negativo.\n" + ResultMult);
		
		//Teste 3: Multiplica��o de um inteiro positivo e 0.
		ResultMult = calc.mult(5, 0);
		System.out.println("Multiplica��o de valor positivo e 0.\n" + ResultMult);
				
		//Teste 4: Multiplica��o de dois 0.
		ResultMult = calc.mult(0, 0);
		System.out.println("Multiplica��o de dois 0.\n" + ResultMult);
		
		//Realizado os testes de multiplica��o n�o foi notado nenhuma irregularidade.
		
		System.out.println();
		
		//TESTE DIVIS�O
		//Teste 1: Divis�o de dois inteiros positivos.
		int ResultDiv = calc.div(10, 3);
		System.out.println("Divis�o de valores positivos.\n" + ResultDiv);
				
		//Teste 2: Divis�o de inteiro positivo e negativo.
		ResultMult = calc.div(10, -3);
		System.out.println("Divis�o de valor positivo e negativo.\n" + ResultDiv);
		
		//Teste 3: Divis�o de um inteiro positivo e 0.*
		ResultMult = calc.div(5, 0);
		System.out.println("Divis�o de valor positivo e 0.\n" + ResultDiv);
				
		//Teste 4: Divis�o de dois 0.*
		ResultMult = calc.div(0, 0);
		System.out.println("Divis�o de dois 0.\n" + ResultDiv);
		
		//Testes 1 e 2 OK. Sem anormalidades.
		//*Ao realizar os testes 3 e 4, nota-se que � necess�rio realizar o tratamento de exce��o. N�o � poss�vel dividir por 0.
	}

}
