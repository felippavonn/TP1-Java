
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numerito = 5;
		System.out.println("Hola elu, ingresa un numerito porfa");
		numerito = scanner.nextInt();
		
		System.out.println("El numerito que dijiste es la suma entre: " + numerito + " + " + numerito + " - " + numerito);
		scanner.close();
	}

}
