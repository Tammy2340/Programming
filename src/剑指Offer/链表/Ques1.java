package 剑指Offer.链表;

import java.util.ArrayList;

/**
 * Created by apple on 2017/8/16.
 *
      输入一个链表，从尾到头打印链表每个节点的值。

 */



//-------------------------利用递归实现-------------------------



public class Ques1 {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode!=null) {
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }
}

