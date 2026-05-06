public class BunnyEars {
    public int bunnyEars(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0 ) {
            return 3 + bunnyEars(n - 1);
        }
        return 2 + bunnyEars(n - 1);
    }
}
