package controller;

public class DigitosControle {

	public DigitosControle() {
		super();
	}
	
	public int Digitos(int N) {
		// Condição de parada -> Quando N é menor que 10 e maior que -10, pois os valores entre esses dois números só possuem um dígito
		if (N<10&&N>-10)
		{
			return 1;
		}
		else
		{
			N = N/10;
			//A função é chamada com a variável cont, com a variável N sendo dividida por 10 previamente 
			int cont = Digitos(N);
			cont++;
			return cont;
		}
	}

}
