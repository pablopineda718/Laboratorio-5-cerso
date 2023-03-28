import java.util.Scanner;

public class Adivinanza {

    public static void main(String[] args) {
        
        // Generar número aleatorio entre 1 y 100
        int numeroAdivinar = (int) (100 * Math.random() + 1);
        
        // Inicializar variables
        int intentos = 5;
        int numeroUsuario;
        Scanner sc = new Scanner(System.in);
        
        // Juego
        System.out.println("Adivina el número entre 1 y 100. Tienes 5 intentos.");
        
        while (intentos > 0) {
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Introduce un número: ");
            numeroUsuario = sc.nextInt();
            
            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Has acertado! El número era " + numeroAdivinar);
                return;
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("El número a adivinar es menor.");
            }
            
            intentos--;
        }
        
        System.out.println("Lo siento, has perdido. El número era " + numeroAdivinar);
        
    }

}
