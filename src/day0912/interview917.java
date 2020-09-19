package day0912;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class interview917 {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String str = sc.nextLine();
        Queue<Character> queue = new LinkedList<>();
        int count = 0;
        int inerror =0;
        int outerror=0;
            if (str.charAt(0)=='P') {
                char j = str.charAt(2);
                queue.offer(j);
                count++;
                if (count>=N-1) {
                    inerror++;
                    System.out.println(inerror);
            }
            if (str.charAt(0)=='D') {
                ((LinkedList<Character>) queue).pop();
                   count--;
                   if (count<1) {
                      outerror++;
                       System.out.println(outerror);
                   }
            }
        }



    }
}
