package view;
import controller.DigitosControle;

public class Principal {

	public static void main(String[] args) {
		DigitosControle DC = new DigitosControle();
		int N = -500;
		System.out.println("O número de dígitos em "+N+" é igual a: "+DC.Digitos(N));

	}

}
