import java.util.Scanner;
public class Intento1 {
    public static void main(String[] args) {
        int n;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Dame el numero");
        n=lectura.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i + ": " + fibonacci(i));
        }
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
