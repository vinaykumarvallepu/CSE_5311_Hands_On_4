
public class fibonacci {

    public static void main(String[] args) {
        int res = fib(5);
        System.out.println("fib(5) = " + res);
    }
    
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        System.out.println("fib(" + n + ") -> fib(" + (n - 1) + ") + fib(" + (n - 2) + ")");
        return fib(n - 1) + fib(n - 2);
            
        
    }
}
