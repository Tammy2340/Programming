package 剑指Offer.树;

/**
 * Created by apple on 2017/8/30.
 * ----------------------------重建二叉树---------------------------
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

/*  思路：1.先求出根节点（前序序列第一个元素）。
         2.将根节点带入到中序遍历序列中求出左右子树的中序遍历序列。
         3.通过左右子树的中序序列元素集合带入前序遍历序列可以求出左右子树的前序序列。
         4.左右子树的前序序列第一个元素分别是根节点的左右儿子
         5.求出了左右子树的4种序列可以递归上述步骤
 *********/

public class Ques1 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return reConBTree(pre,0,pre.length-1,in,0,in.length-1);
    }

    public TreeNode reConBTree(int [] pre,int preLeft,int preRight,int [] in,int inLeft,int inRight) {
        if (preLeft>preRight || inLeft<inRight)
            return null;                     //判断边界条件
        TreeNode root = new TreeNode(pre[preLeft]);
        for (int i=inLeft;i<=inRight;i++) {
            if(in[i]==pre[preLeft]) {
                //构建左子树
                root.left = reConBTree(pre,preLeft+1,preLeft+i-inLeft,in,inLeft,i-1);
                //构建右子树
                root.right = reConBTree(pre,preLeft+i+1-inLeft,preRight,in,i+1,inRight);
            }
        }
        return root;
    }
}
