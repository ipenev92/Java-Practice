public class SumAll {
    public static void main(String[] args) {
        int sum = 0;
        int numbers = 0;
        for (int i = 1; i<1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                numbers++;
                if (numbers == 5) {
                    System.out.println(sum);
                    break;
                }
            }
        }
    }
}
