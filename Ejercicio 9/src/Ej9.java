import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese tres numeros.\n");
		
		System.out.print("Ingrese el primer numero: ");
		int num1 = sc.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		int num2 = sc.nextInt();
		System.out.print("Ingrese el tercer numero: ");
		int num3 = sc.nextInt();
		int mayor = 0;
		
		sc.close();
		
		if(num1 > num2) { // Si el primer numero es mayor que el segundo.
			mayor = num1; // Se almacena el primer numero.
		}
		else if(num1 == num2) { // Si son iguales
			mayor = num1; // Se almacena el primer numero.
		}
		else if(num1 < num2){ // Si el segundo numero es mayor que el primero.
			mayor = num2; // Se almacena el segundo numero.
		}
		
		if(num3 > mayor) { // Si el tercer numero es mayor que el otro se imprime mensaje.
			System.out.println("El numero mayor de esos 3 es: " + num3);
		}
		else if(num3 == mayor) { // Si son iguales se imprime mensaje avisando de que todos los numeros son iguales.
			System.out.println("Todos los numeros son iguales.");
		}
		else { // y sino se imprime el otro, indicando que es mayor a todos.
			System.out.println("El numero mayor de esos 3 es: " + mayor);
		}	

	}
}