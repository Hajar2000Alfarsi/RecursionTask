public class Count8Demo {
    public static void main(String[] args) {
        Count8 count8 = new Count8();

        int result1 = count8.count8(8);
        int result2 = count8.count8(818);
        int result3 = count8.count8(8818);

        System.out.println("count8(8) → " + result1);
        System.out.println("count8(818) → " + result2);
        System.out.println("count8(8818) → " + result3);
    }
}
