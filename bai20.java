package offline.homework;

import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
