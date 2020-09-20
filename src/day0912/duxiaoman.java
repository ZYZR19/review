package day0912;

import java.util.Scanner;

public class duxiaoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1= sc.nextLine();//有的颜料
        String str2 = sc.nextLine();//需要的颜料
        int count = 0;//可以涂多少个色块
        int num =0;
        for (int i =0;i<str1.length();i++) {
             if (str1.charAt(i)== str2.charAt(i)) {
                    count++;

                }else {
                 num++;

                 // char num =  str2.charAt(j+1);
                    //num=str2.charAt(j)
                 }
            }
            System.out.println(count);
        }

    }





    /*小A正在学画画，现在，线稿已经画好了，只剩下涂色部分了。但是小A发现，他的颜料不够了。每一块颜料能涂一个色块，每一个色块的颜色是事先决定好了的。 由于颜料不够，小A只能尽其所能来涂色。如果一个色块没有了颜料，就不能涂色。现在，给你画中需要的色块颜色，和小A现在手上有的颜料，请你计算小A能涂多少个色块。



            输入描述
            输入包含两个字符串，都仅包含大写字母，每一种字母代表一种颜色。 第一个字符串S代表小A手上的颜料，第二个字符串T代表画需要的颜料。

            1≤|S|,|T|≤1000

            输出描述
            输出包含一个数，即最多能涂多少个色块。


            样例输入
            AAB
            ABC
            样例输出
            2*/







    /*小明发现有的字符串中蕴含着一些规律，但是它们又和普通的周期串有点不一样。例如：ABCABDABDABE。如果以3为周期，可以看到其中包含“ABC”、“ABD”和“ABE”等子串，其中“ABD”出现了两次。

    这些子串两两之间最多只有某一位上的字符不相同，其他位置上的字符都一样。小明将其称为“近似串”，由多个“近似串”组成的字符串称为“近似周期串”。“近似周期串”中的每一个“近似串”的长度需大于等于2。

    需要注意的是“ABCABBACD”并不是一个“近似周期串”。如果以3为周期，其子串包括“ABC”、“ABB”和“ACD”，“ABB”与“ACD”、“ABC”与“ACD”均存在两个位置上的字符不相同，因此不是“近似周期串”。特别的，“AAAAAA”也是一个“近似周期串”，因为它满足上述“近似周期串”的定义。

    现在给你一个字符串，请编写一个程序判断该字符串是否是以3为周期的“近似周期串”。



    输入描述
    多组输入，第1行输入一个正整数T表示输入数据的组数。

    对于每一组输入数据：输入一个长度不超过1000的字符串，字符串中只包含大写英文字母。

    输出描述
    针对每一组输入数据，输出该字符串是否是以3为周期的“近似周期串”，如果是输出“Yes”，否则输出“No”。


    样例输入
2
    ABCABDABDABEABEABF
            ABCABDAEC
    样例输出
            Yes
    No*/


