package paradigmafuncional;

import java.util.function.UnaryOperator;

public class Aula01 {
public static void main(String[] args) {
	UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor*3;
	int valor=10;
	System.out.println("O Resultado: "+calcularValorVezesTrinta.apply(2 ));
}
}
