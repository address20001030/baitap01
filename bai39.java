package offline.homework;

import java.util.Scanner;

public class bai39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        float a = 0;
        float s = 0;
        int t = 1;
        for (int i = 1; i < n + 1; i++) {
            t*=i;
            a = 1 / (float) (i + 1);
            s = (float) Math.pow(t + s, a);
        }
        System.out.println(s);
    }
}
