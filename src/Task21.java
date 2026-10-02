import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println((n % m) * (m % n) + 1);
    }
}