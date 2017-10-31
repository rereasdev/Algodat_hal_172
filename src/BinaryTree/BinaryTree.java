
package BinaryTree;

public class BinaryTree implements Cloneable{
     public BinaryTreeNode root;
    
     public BinaryTree(){
         root = null;
     }
     
     public boolean isEmpty(){
         return root == null;
     }
    
     public Object root() {
        return root.element;
    }
     
     public void insert(Object theElement){
         root = insert(root, theElement);
     }
     
     private BinaryTreeNode insert(BinaryTreeNode node, Object data){
         if (node == null){
             node = new BinaryTreeNode(data);
         }
         else{
             if (node.getLeft()== null){
                 node.left = insert(node.left, data);
             }
             else{
                 node.right = insert(node.right, data);
             }
         }
         return node;
     }     
     
     public int countNodes(){
         return countNodes(root);
     }

     private int countNodes(BinaryTreeNode r){
         if (r == null){
             return 0;
         }
         else{
             int l = 1;
             l += countNodes(r.getLeft());
             l += countNodes(r.getRight());
             return l;
         }
     }
     
     public static void visit(BinaryTreeNode r){
        System.out.print(r.getData()+" ");
    }

     public void inorder(){
         inorder(root);
     }
     public static void inorder(BinaryTreeNode r){
         if (r != null){
             inorder(r.getLeft());
             visit(r);
             inorder(r.getRight());
         }
     }

     public void preorder(){
         preorder(root);
     }
     public static void preorder(BinaryTreeNode r){
         if (r != null){
             visit(r);
             preorder(r.getLeft());             
             preorder(r.getRight());
         }
     }

     public void postorder(){
         postorder(root);
     }
     public static void postorder(BinaryTreeNode r){
         if (r != null)
         {
             postorder(r.getLeft());             
             postorder(r.getRight());
             visit(r);
         }
     }

     @Override
    public Object clone(){
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            throw new Error("Node tidak bisa di Clone");
        }
    }
    
     public void cloneToPostOrder(BinaryTree a){
        clone();
        a.postorder();
     }
     
     public void cloneToPreOrder(BinaryTree a){
        clone();
        a.preorder();
     }
//    
//     public void evaluated(BinaryTreeNode r){
//         InfixToPostfix i = new InfixToPostfix();
//         i.postfix(r.left.element.toString());
//         i.postfix(r.right.element.toString());
//     }
 }
 