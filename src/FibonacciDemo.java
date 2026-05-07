public class FibonacciDemo {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        int result1 = fibonacci.fibonacci(0);
        int result2 = fibonacci.fibonacci(1);
        int result3 = fibonacci.fibonacci(2);
        int result4 = fibonacci.fibonacci(5);
        int result5 = fibonacci.fibonacci(10);

        System.out.println("fibonacci(0) → " + result1);
        System.out.println("fibonacci(1) → " + result2);
        System.out.println("fibonacci(2) → " + result3);
        System.out.println("fibonacci(5) → " + result4);
        System.out.println("fibonacci(10) → " + result5);
    }
}
