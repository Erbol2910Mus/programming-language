import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v = in.nextInt();
        int t = in.nextInt();

        int s = v * t;
        int answer = ((s % 109) + 109) % 109;

        System.out.println(answer);
    }
}