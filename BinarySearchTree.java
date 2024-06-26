import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BinarySearchTree{
   public static int getHeight(Node root){
      int lHeight=0;
      int rHeight=0;
      
      if(root == null)
      {
          return 0;
      }
      if(root.left!=null)
      {
          lHeight = getHeight(root.left)+1;
      }
      if(root.right!=null)
      {
          rHeight = getHeight(root.right)+1;
      }
      
      if(lHeight>rHeight)
      {
          return lHeight;
      }
      else{
          return rHeight;
      }
    }
    
    

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}