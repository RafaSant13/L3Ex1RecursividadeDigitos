package controller;

public class DigitosControle {

	public DigitosControle() {
		super();
	}
	
	public int Digitos(int N) {
		// Condi��o de parada -> Quando N � menor que 10 e maior que -10, pois os valores entre esses dois n�meros s� possuem um d�gito
		if (N<10&&N>-10)
		{
			return 1;
		}
		else
		{
			N = N/10;
			//A fun��o � chamada com a vari�vel cont, com a vari�vel N sendo dividida por 10 previamente 
			int cont = Digitos(N);
			cont++;
			return cont;
		}
	}

}
