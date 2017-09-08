package 剑指Offer.链表;

/**
 * Created by apple on 2017/8/18.
 *
 *
 * ------------------------输入一个链表，输出该链表中倒数第k个结点---------------
 *
 *
 */
public class Ques2 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<=0){
            return null;
        }
        ListNode last = head;

        for(int i=1;i<k;i++){
            if(last.next!=null){
                last = last.next;
            }else{
                return null;
            }

        }
        while(last.next!=null){
            head = head.next;
            last = last.next;
        }
        return head;
    }
}
