package view;
import controller.DigitosControle;

public class Principal {

	public static void main(String[] args) {
		DigitosControle DC = new DigitosControle();
		int N = -500;
		System.out.println("O n�mero de d�gitos em "+N+" � igual a: "+DC.Digitos(N));

	}

}
