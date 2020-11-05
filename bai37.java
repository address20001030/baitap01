package offline.homework;

import java.util.Scanner;

public class bai37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        float a = 0;
        float s = 0;
        for (int i = 2; i <= n; i++) {
            a = 1 / (float) i;
            s = (float) Math.pow(i + s, a);
        }
        System.out.println(s);
    }
}
