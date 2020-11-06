package offline.homework;

import java.util.Scanner;

public class bai41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n phan so: ");
        int n = sc.nextInt();
        int i = 0;
        float S = 1;
        while (i < n+1) {
            S = (float) ( 1 + 1.0/ S);
            i++;
        }
        System.out.println(S);
    }
}
