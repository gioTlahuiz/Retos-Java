import java.util.Scanner;


public class reto2 {
    public static boolean esPalindromo(String texto) {
        for (int i = 0, j = texto.length()-1; i < j; i++,j--) {
            if (texto.charAt(i) != texto.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la palabra que deseas validar:");
        String texto = sc.nextLine();
        boolean palindromo = esPalindromo(texto);
        if(palindromo == true){
            System.out.println("Es un palindromo");
        } else{
            System.out.println("No es un palindromo");
        };
    }
}
