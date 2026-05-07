public class SumDigitsDemo {
    public static void main(String[] args) {
        SumDigits sumDigits = new SumDigits();

        int result1 = sumDigits.sumDigits(126);
        int result2 = sumDigits.sumDigits(49);
        int result3 = sumDigits.sumDigits(12);

        System.out.println("sumDigits(126) → " + result1);
        System.out.println("sumDigits(49) → " + result2);
        System.out.println("sumDigits(12) → " + result3);
    }

}
