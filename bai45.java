package offline.homework;

import java.util.Scanner;

public class bai45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int s = 1;
        int x = 0;
        while (n > 0) {
            x = n % 10;
            s *= x;
            n /= 10;
        }
        System.out.println("Tich cac chu so cua n = " + s);
    }
}
