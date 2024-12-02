package BinaryTree;

//BinaryTree Class
class Tree {
  Node root;
}

class Node {
    int key;
    Node left=null, right=null;

    public Node(int item) {
        key = item;
    }
}

public class CreateBinTree {
	
	public static Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            
            return root;
        }

        // Otherwise, recur down the tree 
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // return the (unchanged) node pointer 
        return root;
    }

    public static void inorderRec(Node root) {
    	if(root == null) {
    		return;
    	}
    	if(root!=null) {
    		inorderRec(root.left);
    		System.out.print(root.key + " ");
    		inorderRec(root.right);
    	}
    }
    
    public static void preOrder(Node root) {
	if(root == null) {
		return;
	}
    	if(root!=null) {
    		System.out.print(root.key + " ");
    		preOrder(root.left);    		
    		preOrder(root.right);
    	}
    }

    public static void postOrder(Node root) {
	if(root == null) {
		return;
	}
	if(root!=null) {
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key + " ");
	}
}

    private boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;

        if (key < root.key)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

       private int findMinRec(Node root) {
        if (root == null)
            throw new IllegalStateException("Tree is empty");

        if (root.left == null)
            return root.key;

        return findMinRec(root.left);
    }

     private int findMaxRec(Node root) {
        if (root == null)
            throw new IllegalStateException("Tree is empty");

        if (root.right == null)
            return root.key;

        return findMaxRec(root.right);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = insertRec(tree.root, 50);
        tree.root= insertRec(tree.root, 20);
        tree.root= insertRec(tree.root, 80);
        tree.root= insertRec(tree.root, 60);
        tree.root= insertRec(tree.root, 40);
        tree.root= insertRec(tree.root, 10);
        tree.root= insertRec(tree.root, 70);

        // Print inorder traversal of the tree
        System.out.println("Inorder traversal:");
       inorderRec(tree.root);
           // Output: 20 30 40 50 60 70 80
        
        System.out.print("\n");
        System.out.println("preorder traversal:");
        preOrder(tree.root);
        
        System.out.print("\n");
        System.out.println("postorder traversal:");
        postOrder(tree.root);

}
    
}

