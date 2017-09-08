package 剑指Offer.数的运算;

/**
 * Created by apple on 2017/8/19.
 *
 *---------------------数值的整数次方---------------------
 *
 *  给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 剑指书中细节：
 *1.当底数为0且指数<0时会出现对0求倒数的情况，需进行错误处理，设置一个全局变量；
 *2.判断底数是否等于0：由于base为double型，不能直接用==判断????
 *3.优化求幂函数
    当n为偶数，a^n =（a^n/2）*（a^n/2）
    当n为奇数，a^n = a^[(n-1)/2] * a^[(n-1)/2] * a
    时间复杂度O(logn)
 **/


public class Ques2 {
    public double Power(double base, int exponent) {
        double result = base;
        if(exponent>0){
            for(int i=exponent;i>1;i--){
                result = result*base;
            }
        }else if(exponent==0){
            result = 1;
        }else{
            int s=-exponent;
            while(s>1){
                s--;
                result=result*base;
            }
            if(result!=0){
                result = 1/result;
            }else{
                result = 0;
            }

        }
        return result;
    }
}

