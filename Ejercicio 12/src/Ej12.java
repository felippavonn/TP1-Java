import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un numero para calcular la suma de sus digitos: ");
		int num = sc.nextInt();
		sc.close();
		
		int resultado = sumarDigitos(num); // Paso como argumento de la función sumarDigitos el número a sumar sus dígitos.
		
		System.out.println("\nEl resultado de la suma de los digitos de " + num + " es: " + resultado);
	}
	
	public static int sumarDigitos(int n) {
		int result = 0;
		
		n = Math.abs(n); // Se saca el valor absoluto del numero, en caso de que sea negativo.
		
		while(n > 0) { // El ciclo se mantiene mientras que no se haya operado en todos los dígitos del número.
			result += n % 10; // Obtiene el resto de la división por 10, siendo el último dígito sumado al resultado.
			n = n / 10; // Elimina el último dígito ya utilizado.
		}
		
		
		return result; // Devuelve el resultado.
	}

}
