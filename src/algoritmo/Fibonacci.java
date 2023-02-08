package algoritmo;

public class Fibonacci extends Thread{
	//ATRIBUTOS
	int resultado, n1, n2, iteraciones;
	//CONSTRUCTOR
	public Fibonacci(int N) {
		n1 = 1;
		n2 = 1;
		resultado = 0;
		iteraciones = N;
	}
	//METODO RUN
	public void run() {
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 0; i < iteraciones; i++) {
			resultado = n1+n2;
			System.out.println(resultado);
			n1=n2;
			n2=resultado;
		}
	}

}
