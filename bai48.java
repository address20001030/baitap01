package offline.homework;

import java.util.Scanner;

public class bai48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int x=0;
        int t=1;
        while (n>0){
            x=n%10;
            if(x%2!=0)
            {
                t*=x;
            }
            n/=10;
        }
        System.out.println("Tich = "+t);

    }
}
