public class FactorialProgram {
    public static void main(String[] args) {
        Factorial fact = new Factorial();

        int result1 = fact.factorial(1);
        int result2 = fact.factorial(2);
        int result3 = fact.factorial(3);

        System.out.println("Factorial of 1 = " + result1);
        System.out.println("Factorial of 2 = " + result2);
        System.out.println("Factorial of 3 = " + result3);

    }
}
