public class Count7Demo {
    public static void main(String[] args) {
        Count7 count = new Count7();

        int result1 = count.count7(717);
        int result2 = count.count7(7);
        int result3 = count.count7(123);

        System.out.println("Count717 = " + result1);
        System.out.println("Count7 = " + result2);
        System.out.println("Count123 = " + result3);
    }
}
