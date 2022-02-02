class Node{
    int data;
    Node left, right;

    public Node(int item){
        data=item;
        left=right=null;
    }
}

class TraverseBinaryTree{
    Node root;
    public void traverse(Node node){
        if(node!=null){
            traverse(node.left);
            System.out.print(" "+ node.data);
            traverse(node.right);
        }
    }

    public static void main(String[] args) {

        //TraverseBinaryTree class object
        TraverseBinaryTree t = new TraverseBinaryTree();

        //create nodes of tree
        t.root = new Node(2);
        t.root.left = new Node(4);
        t.root.right = new Node(6);
        t.root.left.left = new Node(8);

        System.out.println("Binary tree Inorder traversal");
        t.traverse(t.root);

        
    }

}