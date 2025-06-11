import java.util.Scanner;

public class EjercicioCinco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int numero, resultado;
		System.out.println("Ingrese un numero del 1 al 10");
		numero = scanner.nextInt();
		for(int i=0; i<=10; i++)
		{
			resultado = numero * i;
			System.out.println(numero + "x" + i + "= " + resultado);
		}
	}

}
