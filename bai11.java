package offline.homework;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int s = 0;
        int x = 1;
        for (int i = 1; i < n + 1; i++) {
            x *= i;
            s += (1 * x);
        }
        System.out.println("Tong = " + s);
    }
}
