package baslangic1;

public class fibonnaciornegi {
    public static void main(String[] args) {
        int n = 10; // Fibonacci serisinin ne kadar uzun olacağını belirleyin
        System.out.println("Fibonacci Serisi:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
