package 剑指Offer.字符串;

/**
 * Created by apple on 2017/8/14.
 *
 *
 *
   ------------------------替换空格-------------------------
   请实现一个函数，将一个字符串中的空格替换成“%20”。
   例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

 */



public class Ques1 {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s","%20");
    }
}







