
public class TestaValores {
	
	public static void main(String[] args) {
		
		Calculadora primeiraCalculadora = new Calculadora();
		
		Double resultadoSoma = primeiraCalculadora.somar(12.30, 12.30);
		Double resultadoSubtrai = primeiraCalculadora.subtrair(30.0, 20.0);
		
		System.out.println(resultadoSoma);
		System.out.println(resultadoSubtrai);
		
	}

}
