import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		int i, numero;
		for(i=1;i<100;i++)
		{
			if(i<=100) {
				System.out.println("Ingrese un numero");
				numero = scanner.nextInt();
			}
			else if (i > 100) {
				System.out.println("eu bata");
			}
		}
	}

}
