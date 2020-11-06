package offline.homework;

import java.util.Scanner;

// bai 15
public class bai15_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();
        float s = 0;
        int t = 0;
        for (int i = 1; i < n + 1; i++) {
            t += i;
            s += 1 / (float) t;
        }
        System.out.println("Tong = " + s);
    }
}
