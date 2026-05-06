public class Count8 {
    public int count8(int n) {
        if (n == 0) {
            return 0;
        }

        int lastDigit = n % 10;
        int secondLastDigit = (n / 10) % 10;

        if (lastDigit == 8) {
            if (secondLastDigit == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        }
        return count8(n / 10);
    }
}
