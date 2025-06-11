import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String texto = scanner.nextLine(); 

        String textoInvertido = ""; 

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido = textoInvertido.concat(String.valueOf(texto.charAt(i)));
        }

        System.out.println(textoInvertido);

        scanner.close();
    }
}
