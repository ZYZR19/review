package day0921;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    //返回第三大的数字
    public int thirdMax (int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        int len = nums.length;
        int ret=0;
        int count=0;
        Arrays.sort(nums);
        int i =len-1;
        for (;i>0;i--) {
            if (nums[i]>nums[i-1]) {
                count++;
                if (count==3) {
                    break;
                }
            }
        }
       if (len>=3&&count==3) {
          ret= nums[len-3];
          }else {
           ret = nums[len - 1];
       }
        System.out.println(ret);
       return ret;
    }





    //数组子串的最大和
    public int maxSubArray (int[] nums) {
        // write code here
        int total =0;

        for(int i = 0;i<nums.length;i++) {
            int totalnow = 0;
            for (int j=i;j<nums.length;j++) {
                totalnow=totalnow+nums[j];
                if (totalnow>total) {
                    totalnow=total;

                }
            }

        }
        return total;

    }




    //小明一天只能吃1个或者2个糖 n个糖小明什么时候吃完
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eatSuger = sc.nextInt();
        int count = sugerCount(eatSuger);
        System.out.println(count);
    }
    //青蛙跳台阶的问题 使用了递归 青蛙可以跳一次 也可以跳两次
    public static int sugerCount (int eatSuger) {
        if (eatSuger==1) {
            return 1;
        }
        if (eatSuger==2) {
            return 2;
        }
        int ret = sugerCount(eatSuger-1)+sugerCount(eatSuger-2);
        return ret;
    }
}
