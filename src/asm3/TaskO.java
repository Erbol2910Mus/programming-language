//package asm3;

import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int found = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                found = 1;
            }
        }

        System.out.println(found == 1 ? "YES" : "NO");
    }
}