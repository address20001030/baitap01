package offline.homework;

import java.util.Scanner;

public class bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        System.out.println("Tong cac uoc nho hon n s =" + s);
    }
}
