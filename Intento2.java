import java.util.Scanner;
public class Intento2 {
    public static void main(String[] args) {
        int n;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Dame el numero.");
        n=lectura.nextInt();

        System.out.println("Fib: " + fibonacci(i));
    }
    public static long fibonacci(int n) {
        if (n <= 1){
          return n;
        }
        else{
          return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
