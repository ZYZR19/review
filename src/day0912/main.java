package day0912;

import org.omg.PortableInterceptor.INACTIVE;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        int strindex = 0;
        int length = 0;
        if (str.length()==0 || str==null){
            return;
        }
        for (int i =0;i<str.length();i++) {
            if (str.charAt(i)=='+'|| str.charAt(i)=='-' || (str.charAt(i)>='0'&&str.charAt(i)<='9')) {
                System.out.print(str.charAt(i));
                strindex = str.charAt(i);
                strindex++;
                length++;
                //System.out.println(str.substring(strindex,length+strindex-1));
            }else {
                int flag = 0;
                System.out.println(flag);
                break;
            }
            //System.out.println(str.substring(strindex,length+strindex-1));
        }


    }
}
