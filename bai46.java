package offline.homework;

import java.util.Scanner;

public class bai46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int x = 0;
        int dem = 0;
        while (n > 0) {
            x = n % 10;
            if (x % 2 != 0) {
                dem++;
            }
            n /= 10;
        }
        System.out.println("So luong chu so le trong n= " + dem);

    }
}
