package offline.homework;

import java.util.Scanner;

public class bai49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int a = 0;
        int x = 0;
        while (n >0) {
            x=n%10;
            n/=10;
        }
        System.out.println("Chu so dau tien cua n la: "+x);
    }
}
