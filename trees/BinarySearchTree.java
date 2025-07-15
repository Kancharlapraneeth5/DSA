package trees;

public class BinarySearchTree {
    Node root;

    public class Node{
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public boolean contains(int data){
        // The contains method works fine even without the commented-out code. please check the logic below.
        // if(root == null){
        //     return false;
        // }
        Node temp = root;
        while(temp != null){
            if(data < temp.data){
                temp = temp.left;
            }else if(data > temp.data){
                temp = temp.right;
            }else{
                return true;
            }
        }
        return false;
    }

    public boolean insert(int data){
        if(root == null) {
            root = new Node(data);
            return true;
        } else {
            Node temp = root;
            while(true){
                if(data == temp.data){
                    System.out.println("Data cannot be inserted, it already exists in the tree.");
                    return false;
                }
                // Root left side
                else if(data < temp.data){
                    if(temp.left  == null){
                        temp.left = new Node(data);
                        return true;
                    }
                    temp = temp.left;
                }
                // Root right side
                else if(data > temp.data){
                    if(temp.right == null){
                        temp.right = new Node(data);
                        return true;
                    }
                    temp = temp.right;
                }
            }
        }
    }
}
