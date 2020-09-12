package day0912;

public class interview01 {
    //求一个字符串最长重复子串
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

}
