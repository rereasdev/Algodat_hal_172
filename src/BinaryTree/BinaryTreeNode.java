
package BinaryTree;

 public class BinaryTreeNode{
     
     BinaryTreeNode left, right;
     Object element;
 
     public BinaryTreeNode(){
         left = null;
         right = null;
         element = null;
     }

     public BinaryTreeNode(Object n){
         left = null;
         right = null;
         element = n;
     }

     public void setLeft(BinaryTreeNode n){
         left = n;
     }

     public void setRight(BinaryTreeNode n){
         right = n;
     }

     public BinaryTreeNode getLeft(){
         return left;
     }

     public BinaryTreeNode getRight(){
         return right;
     }

     public void setData(Object d){
         element = d;
     }

     public Object getData(){
         return element;
     }     
 }