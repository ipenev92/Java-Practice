import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {
        int dec_num;
        int quot;
        int i = 1;
        int j;
        int bin_num[] = new int[100];
        Scanner text = new Scanner(System.in);
        System.out.print("Input a Decimal Number : ");
        dec_num = text.nextInt();
        text.close();
        quot = dec_num;
        while (quot != 0) {
            bin_num[i++] = quot%2;
            quot = quot/2;
        }
        System.out.print("Binary number is: ");
        for (j=i-1; j>0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}