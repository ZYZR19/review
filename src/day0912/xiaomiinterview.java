package day0912;

import javax.security.sasl.SaslClient;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class xiaomiinterview {
    static int[] primeFactorization(int num) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int [] arr = new int[count];
        for (int i =2;i<num;i++)  {
            if (num%i!=0) {
                System.out.println(num);
            }else {
              for (int j=2;j<Math.sqrt(num);j++) {
                  if (num%j==0) {
                      num /=j;
                      count++;
                      arr[j-2]=j;
                  }else {
                      j++;
                  }
              }
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;

}
    /*给定一个二维网格和一个单词，找出该单词是否存在于网格中。

    单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。



    输入描述
    非最后一行的其他行表示二维字母数组（每行通过英文逗号分割），最后一行表示待搜索的单词

            输出描述
    布尔类型，表示是否存在


            样例输入
    A,B,C,E
            S,F,C,S
    A,D,E,E
            ABCCED
    样例输出
true

    提示
    字母数组board 和 待搜索的单词 word 中只包含大写和小写英文字母。
            1 <= board.length <= 200
            1 <= board[i].length <= 200
            1 <= word.length <= 10^3
    */






    /*质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数，否则称为合数。
    请将一个正整数分解质因数，如果输入的数不是合数，打印其本身，否则按照从小到大的属性打印出其质因子。



    输入描述
            一个正整数

    输出描述
    分解的质因数列表（从小到大按行打印输出）


    样例输入
100
    样例输出
2
        2
        5
        5
*/

}
