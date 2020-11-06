package offline.homework;

import java.util.Scanner;

public class bai61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int x = 0;
        int a = n % 10;
        int dem = 0;
        while (n > 0) {
            x = n % 10;
            if (a > x) {
                dem++;
            }
            n /= 10;
        }
        if (dem == 0) {
            System.out.println("cac chu so cua n giam dan");
        } else {
            System.out.println("Cac chu so cua n ko giam dan");
        }
    }
}
