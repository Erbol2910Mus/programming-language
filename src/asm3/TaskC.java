//package asm3;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        for (long i = a; i <= b; i++) {
            long sqrt = (long) Math.sqrt(i);

            if (i >= 0 && sqrt * sqrt == i) {
                System.out.print(i + " ");
            }
        }
    }
}