import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class reto5 {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre de usuario: ");
        Scanner sc = new Scanner(System.in);
        String nombreUsuario = sc.next();
        System.out.println("Ingrese su contraseña: ");
        String password = sc.next();
        //ingresamos el menu
        int opcion;
        System.out.println("Saldo actual: ");
        int saldo = sc.nextInt();
        do {
            System.out.println("Selecciona una de las siguientes operaciones: ");
            System.out.println("1.Consultar saldo");
            System.out.println("2.Ingresar dinero");
            System.out.println("3.Retirar dinero");
            System.out.println("4.Consultar últimos movimientos");
            System.out.println("5.Convertir divisas");
            System.out.println("6.Salir (presione 0)");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Elegiste la opcion 1.Consultar saldo");
                    System.out.println(saldo);
                    break;
                case 2:
                    System.out.println("Elegiste la opcion 2.Ingresar dinero");
                    System.out.println("Ingresa el monto que deseas agregar a tu cuenta: ");
                    int monto = sc.nextInt();
                    int montoActiualizado = saldo + monto;
                    System.out.println("Su saldo actualizado es: "+ montoActiualizado);
                    break;
                case 3:
                    System.out.println("Elegiste la opcion 3.Retirar dinero");
                    System.out.println("Ingresa el monto que deseas retirar de tu cuenta: ");
                    int monto2 = sc.nextInt();
                    int montoActualizado = saldo - monto2;
                    System.out.println("Su monto actualizado es: "+ montoActualizado);
                    break;
                case 4:
                    System.out.println("Elegiste la opcion 4.Consultar últimos movimientos");
                    break;
                case 5:
                    System.out.println("Elegiste la opcion 5.Convertir divisas");
                    System.out.println("Menú");
                    System.out.println("1.Convertir MXN a USD");
                    System.out.println("2.Convertir MXN a EUR");
                    System.out.println("3.Convertir MXN a USD a EUR");
                    int opcionConversion = sc.nextInt();
                    if(opcionConversion == 1){
                        System.out.println("Convertir MXN -> USD");
                        double usd = 18.00;
                        double conversionUsd = saldo/usd;
                        System.out.println("Monto USD: " + conversionUsd);
                    }else if(opcionConversion == 2){
                        System.out.println("Convertir MXN -> EUR");
                        double eur = 20.00;
                        double conversionEur = saldo/eur;
                        System.out.println("Monto EUR: " + conversionEur);
                    } else if (opcionConversion == 3) {
                        System.out.println("Convertir USD -> EUR");
                        double usd = 18.00;
                        double eur = 20.00;
                        double conversionUsdEur = (saldo/usd)/eur;
                        System.out.println("Monto USD a Euros: " + conversionUsdEur);
                    }else{
                        System.out.println("Opcion no permitida");
                    }
                    break;
                    case 6:
                        System.out.println("Salir");
            }
        }while(opcion!=6);

    }
}
