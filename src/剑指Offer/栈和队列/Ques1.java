package 剑指Offer.栈和队列;

import java.util.Stack;

/**
 * Created by apple on 2017/8/19.


 ----------------用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。----------------


 */



public class Ques1 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int tmp= stack2.pop();                    //弹出stack2中的第一个值
        while(!stack2.isEmpty()) {                //将stack2中剩余的值弹回stack1存储
            stack1.push(stack2.pop());
        }
        return tmp;
    }
}
