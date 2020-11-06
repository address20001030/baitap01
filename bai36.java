package offline.homework;

import java.util.Scanner;

public class bai36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float s = 0;
        int t = 1;
        for (int i = 1; i < n + 1; i++) {
            t *= i;
            s = (float) Math.sqrt(t + s);
        }
        System.out.println(s);
    }
}
