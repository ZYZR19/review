package day0912;

public class interview01 {
   /* //求一个字符串最长重复子串
   // 给一个字符串，求该字符串的最长重复子串，子串可以包含重叠部分
    //遍历该字符串和进行字符之间的比较 实用一个滑动窗口 之比较两端的字符是否相等
    //依次从左向右滑动,滑动的过程中比较尺子两端的字符是否相等 并且更新字符串的最大长度
    //以及字符串的起始下标 并且把尺子的大小取值依次为1--str.length-1
    public static String  getStr (String str) {
        //处理为空的情况
        if (str==null || str.length()<1) {
            return  null;
        }
        int maxi=0,maxlen=0,len=0;//最长重复子串的起始下标,最长重复子串的最大长度,当前重复子串的长度
        //外层循环控制滑动窗口的大小 取值从1开始到str
        for (int i =1;i<str.length();i++) {
          //内层循环遍历该字符串
            for (int j=0;j<str.length()-i;j++) {
                //每次只比较尺子两端的字符是否相等  相等len++ 否则len清零
                if (str.charAt(j)==str.charAt(i+j)) {
                    len++;
                }else {
                    len =0;
                }
                if (len>maxlen) {
                    maxlen = len;
                    maxi=j-len+1;
                }
            }
        }
        if (maxlen>0) {
            System.out.println(maxlen);
            return  str.substring(maxi,maxlen);
        }
        return null;
    }

    public static void main(String[] args) {
        String  str = "abcaba";
        System.out.println(getStr(str));
    }
*/






   //求解字符串中最长重复子串
    //使用两个指针,两个指针的间隔从123依次增大 同时向右移动两个指针 在移动过程中判断指针
    //位置的字符是否相同,并记录最长子串的长度
    public  static String  maxRepat (String input) {
        //
        if (input ==null|| input.length()==0) {
            return null;
        }
        //重复子串的最长长度
        int max = 0;
        int first =0;
        int k = 0;
        for (int i =1 ; i<input.length();i++) {
            for(int j = 0;j<input.length()-i;j++) {
                if (input.charAt(j)==input.charAt(j+i)) {
                    k++;
                }else{
                    k=0;
                }
                if (k>max) {
                   max = k ;
                   first = j - k + 1;
                }
            }
        }
        if (max>0) {
            //System.out.println(max);
            return input.substring(first,first+max);
        }
        return null;

    }

    public static void main(String[] args) {
        String s = "abcdeabcabcde";
        System.out.println(maxRepat(s));
    }
}
