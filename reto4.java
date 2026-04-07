import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {
        System.out.println("Ingresa tu edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        System.out.println("Ingresa tu ingreso mensual: ");
        int ingreso = sc.nextInt();
        if(edad > 70 && ingreso >= 300){
            int prima = 500;
            double primaCalculada = prima + prima * 0.1;
            System.out.println("Su prima es de : " + primaCalculada);
        }else if(edad > 70 && ingreso < 300){
            int prima = 500;
            double primaCalculada = prima + prima * 0.05;
            System.out.println("Su prima es de:" + primaCalculada);
        }
        if(edad >= 50 && edad <= 69 && ingreso >= 300){
            int prima = 400;
            double primaCalculada = prima + prima * 0.1;
            System.out.println("Su prima es de : " + primaCalculada);
        }else if(edad >= 50 && edad <= 69 && ingreso < 300) {
            int prima = 400;
            double primaCalculada = prima + prima * 0.05;
            System.out.println("Su prima es de:" + primaCalculada);
        }
        if(edad >= 30 && edad <= 49 && ingreso >= 300){
            int prima = 250;
            double primaCalculada = prima + prima * 0.1;
            System.out.println("Su prima es de : " + primaCalculada);
        }else if(edad >= 30 && edad <= 49 && ingreso < 300)  {
            int prima = 250;
            double primaCalculada = prima + prima * 0.05;
            System.out.println("Su prima es de:" + primaCalculada);
        }
        if (edad <= 29 && ingreso >= 300){
            int prima = 100;
            double primaCalculada = prima + prima * 0.1;
            System.out.println("Su prima es de : " + primaCalculada);
        }else if(edad <= 29 && ingreso < 300) {
            int prima = 100;
            double primaCalculada = prima + prima * 0.05;
            System.out.println("Su prima es de:" + primaCalculada);
        }
    }
}
