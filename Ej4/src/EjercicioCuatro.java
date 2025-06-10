import java.util.Scanner;

public class EjercicioCuatro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int numeroPos;
		
		System.out.println("Ingrese un número entero positivo");
		numeroPos = scanner.nextInt();

		if (numeroPos <= 0) {
			System.out.println("El numero debe ser positivo y entero");
			return;
		}
		
		int sumaPares = 0;
		int sumaImpares = 0;
		
		for (int i = 1; i<= numeroPos ; i++)
		{		
			if (i % 2 == 0) {
				sumaPares += i;
			}
			else {
				sumaImpares += i;
			}
		}
		
		System.out.println("Suma pares desde 1 hasta" + numeroPos + ": " + sumaPares);
		System.out.println("Suma impares desde 1 hasta" + numeroPos + ": " + sumaImpares);

	}

}
