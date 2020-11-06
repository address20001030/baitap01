package offline.homework;

import java.util.Scanner;

public class bai35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float s = 0;
        for (int i = n; i > 0; i--) {
            s = (float) Math.sqrt(i + s);
        }
        System.out.println(s);
    }
}
