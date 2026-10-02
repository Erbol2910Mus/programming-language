import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}