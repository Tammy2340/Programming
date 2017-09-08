package 剑指Offer.链表;

import java.util.Stack;

/**
 * Created by apple on 2017/8/18.


 ---------------输入一个链表，反转链表后，输出链表的所有元素。----------------


 */




public class Ques3 {
    public ListNode ReverseList(ListNode head) {
        if(head==null)                   //head为当前节点
            return null;
        ListNode pre = null;                 //pre为当前节点前一节点
        ListNode next = null;                //head为当前节点后一节点
        while(head!=null){
            next = head.next;              //先用next保存head节点下一节点信息
            head.next = pre;               //保存next后，让head的next从指向next改为指向pre  即改变链表指针方向
            pre = head;
            head = next;
        }
        return pre;
    }
}
