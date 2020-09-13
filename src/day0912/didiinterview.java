package day0912;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        //以str的长度除以n 把字符串进行分组
        //如果不能整除就给lenth加1
        //设置lenth长度的数组 遍历这个数组
        //反转数组中每一个下标中存的字符串
        int lenth = str.length()/n;
        if(str.length()%n!=0) {
            lenth ++;
        }
        int []arr = new int[lenth];
       for (int i =0;i<lenth;i++) {
           StringBuffer tmp = new StringBuffer();
           String s = str.substring(0,n);
           for (int j =s.length()-1;j>=0;j--) {
               tmp.append(s.charAt(j)) ;
           }
           System.out.println(tmp.toString());

       }
       }



}
