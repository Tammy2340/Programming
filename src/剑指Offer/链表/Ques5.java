package 剑指Offer.链表;

/**
 * Created by apple on 2017/8/24.
 * -----------------------------------复杂链表的复制--------------------------------
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */

public class Ques5 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead==null)
            return null;
        RandomListNode pcur = pHead;
        //复制链表A->B->C->D 为A->A'->B->B'->C->C'->D->D'
        while (pcur!=null) {
            RandomListNode node = new RandomListNode(pcur.label);
            node.next = pcur.next;
            pcur.next = node;
            pcur = node.next;
        }
        pcur = pHead;
        //处理random指针
        while(pcur!=null) {
            if(pcur.random!=null) {
                pcur.next.random = pcur.random.next;
            }
            pcur = pcur.next.next;
        }
        pcur = pHead;
        RandomListNode head = pHead.next;
        RandomListNode cur = head;
        //拆分链表
        while (pcur!=null) {
            pcur.next = pcur.next.next;
            if (cur.next!=null) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
            pcur = pcur.next;
        }
        return head;
    }
}
