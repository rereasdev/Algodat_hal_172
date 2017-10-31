
package BinaryTree;

public class DriverBinaryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        //tampilkan preorder, postorder dan inorder dari Object BT
        System.out.println("PreOrder");
        bt.preorder();
        System.out.println();
        System.out.println("PostOrder");
        bt.postorder();
        System.out.println();
        System.out.println("inOrder");
        bt.inorder();
        System.out.println("");
        BinaryTree ba = new BinaryTree();
        //ClonetoPostOrder
        System.out.println("ClonetoPostOrder");
        ba.cloneToPostOrder(bt);
        System.out.println();
        //ClonetoPreOrder
        System.out.println("ClonetoPreOrder");
        ba.cloneToPreOrder(bt);
        System.out.println();
    }
    
}
