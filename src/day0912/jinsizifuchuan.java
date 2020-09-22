package day0912;

import java.util.Scanner;

public class jinsizifuchuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i =0;i<num;i++) {
            String str = sc.nextLine();
            int left = 0;
            int right = left+3;
            if (str.charAt(left)==str.charAt(right)) {
                System.out.println("yes");
            }
        }

    }
}
