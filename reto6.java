import java.util.Scanner;

public class reto6 {
    public static int fibonacci(int n) {
     if(n <= 1){
         return n;
     }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa hasta que numero deseas sacar la secuencia de fibonacci: ");
        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(fibonacci(i) + "");
        }
        input.close();
    }
}

