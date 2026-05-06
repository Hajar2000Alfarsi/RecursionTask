public class TriangleDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        int result1 = triangle.triangle(0);
        int result2 = triangle.triangle(1);
        int result3 = triangle.triangle(2);

        System.out.println("triangle(0) → " + result1);
        System.out.println("triangle(1) → " + result2);
        System.out.println("triangle(2) → " + result3);
    }
}
