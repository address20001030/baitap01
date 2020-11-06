package offline.homework;

import java.util.Scanner;

public class bai34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float s = 0;
        for (int i = 1; i < n + 1; i++) {
            s = (float) Math.sqrt(i + s);
        }
        System.out.println(s);
    }
}
