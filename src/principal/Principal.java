package principal;

import algoritmo.Fibonacci;

public class Principal {
	
	public static void main(String[] args) {
		
		Fibonacci hilo1 = new Fibonacci(20);
		hilo1.start();
		
		Fibonacci hilo2 = new Fibonacci(20);
		hilo2.start();
		
	}

}
