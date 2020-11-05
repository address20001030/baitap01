package offline.homework;

import java.util.Scanner;

public class bai40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        System.out.println("Nhap n dau can: ");
        int n = sc.nextInt();
        float s = 0;
        int t = 1;
        for (int i = 1; i < n + 1; i++) {
            t*=x;
            s = (float) Math.sqrt(t + s);
        }
        System.out.println(s);
    }
}
