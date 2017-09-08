package Leetcode.动态规划;

/**
 * Created by apple on 2017/8/31.
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected
 * and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 */

public class Ques1 {
    public int rob(int[] nums) {
        int rob = 0; //如果抢劫当前房子拥有的最大值
        int notrob = 0; //如果不抢劫当前房子拥有的最大值
        for (int i=0;i<nums.length;i++) {
            int currob = notrob + nums[i]; //如果抢劫第i个房子，不抢第i-1房子的最大值+第i个房子的财产
            notrob = Math.max(rob,notrob); //不抢第i个房子，则当前财富为选择抢第i-1个房子和不抢所拥有的财富中的较大一个
            rob = currob; //更新保存如果抢第i个房子拥有的最大值
        }
        return Math.max(rob,notrob);
    }
}
