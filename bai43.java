package offline.homework;

import java.util.Scanner;

public class bai43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int dem = 0;
        while (n >= 10) {
            n /= 10;
            dem++;
        }
        System.out.println(dem + 1);

    }
}
