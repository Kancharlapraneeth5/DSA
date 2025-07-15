package trees;

public class Main {
    public static void main(String[] args) {
        // Example usage of BinarySearchTree
        BinarySearchTree bst = new BinarySearchTree();
        // System.out.println("the root value of the BST is: " + bst.root);
        bst.insert(10);
        bst.insert(5);  
        bst.insert(15);
        bst.insert(3);
        System.out.println("the root value of the BST is: " + bst.root.data);
        bst.insert(20);
        System.out.println("Insertion check for 20: "+ bst.root.right.right.data);

        System.out.println("------Contains Method Test------");
        System.out.println("Does the BST contain 10? " + bst.contains(10));
        System.out.println("Does the BST contain 5? " + bst.contains(5));
        System.out.println("Does the BST contain 15? " + bst.contains(15));
        System.out.println("Does the BST contain 3? " + bst.contains(3));
        System.out.println("Does the BST contain 20? " + bst.contains(20));
        System.out.println("Does the BST contain 25? " + bst.contains(25));
   }
}
