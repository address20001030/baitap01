package offline.homework;

import java.util.Scanner;

public class bai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int t = 1;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0 && i % 2 != 0) {
                t *= i;
            }
        }
        System.out.println("Tich so tich le: " + t);
    }
}
