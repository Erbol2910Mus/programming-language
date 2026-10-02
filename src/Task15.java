import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int total = (a * 100 + b) * n;

        System.out.println(total / 100 + " " + total % 100);
    }
}