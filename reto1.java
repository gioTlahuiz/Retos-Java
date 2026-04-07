import java.util.Random;
import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero de participantes: ");
        Scanner sc = new Scanner(System.in);
        int participantes = sc.nextInt();
        Random rand = new Random();
        int aleatorio = rand.nextInt(participantes);
        System.out.println("El numero ganador es: " + aleatorio);
    }
}
