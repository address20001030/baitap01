package offline.homework;

import java.util.Scanner;

public class bai42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n=sc.nextInt();
        int x=0, max=0;
        for (int i = 1; i < n; i++) {
            x+=i;
            if(x<n){
                max=i;
            }
        }
        System.out.println("K can tim la: "+ max);
    }
}
