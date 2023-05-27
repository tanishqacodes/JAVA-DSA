import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        System.out.println("Enter to know thw occurence of no..");
        int k = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == k) {
                count++;
            }
            n = n / 10; // n /= 10
        }

        System.out.println(count);
    }
}
