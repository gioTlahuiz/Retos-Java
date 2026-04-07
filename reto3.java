import java.util.Scanner;
import java.util.Random;

public class reto3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int aleatorio = rand.nextInt(10);
        System.out.println("Ingresa un número del 1 al 10: ");
        Scanner sc = new Scanner(System.in);
        int numeroUsuario = sc.nextInt();
        while(numeroUsuario != aleatorio){
            if(numeroUsuario < aleatorio){
                System.out.println("El numero ingresado es menor que el número aleatorio");
            }else{
                System.out.println("El numero ingresado es mayor que el número aleatorio");
            }
            System.out.println("Intentalo de nuevo");
            numeroUsuario = sc.nextInt();
        }
    }
}
