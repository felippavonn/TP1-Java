import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese una frase para contar la cantidad de palabras: ");
		String frase = sc.nextLine();
		
		contarPalabras(frase); // Funcion para contar palabras.
				
		sc.close();
	}
	
	public static void contarPalabras(String str) {
		String[] palabras = str.split(" "); // Almacena las subcadenas de espacio en blanco en cada indice del array palabras.
			
		System.out.println("La cantidad de palabras de la frase '" + str + "' es de: " + palabras.length);
	}

}
