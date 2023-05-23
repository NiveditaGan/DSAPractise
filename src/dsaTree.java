import static java.lang.Math.max;

public class dsaTree {
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    static Node root;
    public static void main(String[] args){
        dsaTree tree=new dsaTree();
        int[] arr={4,6,12,3,9,7,14,2};
        for(int i=0;i<arr.length;i++){
            root=tree.createBinarySearchTree(root, arr[i]);
        }
        tree.traverseTreeInOrder(root);
        int min = tree.findMinBinTree(root);
        System.out.println("Minimum Value from the Binary Search Tree :::"+min);

        System.out.println(tree.searchElement(root, 3));
        System.out.println(tree.searchElement(root, 12));
        System.out.println(tree.searchElement(root, 99));
        System.out.println(tree.searchElement(root, 6));

        int height = tree.getHeightOfTree(root);
        System.out.println("Height of the tree is ::::"+ height);

    }

    public Node createBinarySearchTree(Node root, int val){
        Node newNode=new Node(val);
        if(root==null){
            root= newNode;
            return root;
        }
        if(val< root.value){
            root.left=createBinarySearchTree(root.left,val);
        }else if(val>root.value){
            root.right = createBinarySearchTree(root.right, val);
        }
        return root;
    }

    public void traverseTreeInOrder(Node root){
        if(root!=null) {
            traverseTreeInOrder(root.left);
            System.out.println(root.value);
            traverseTreeInOrder(root.right);
        }
    }

    public int findMinBinTree(Node root){
        Node current = root;
        while(current.left!=null){
            current=current.left;
        }
        return current.value;
    }

    public boolean searchElement(Node root, int val){
        if (root==null)
            return false;
        if (val==root.value)
            return true;
            if(val<root.value)
                return searchElement(root.left, val);
            else
                return searchElement(root.right, val);
    }

    public int getHeightOfTree(Node root){
        if (root == null){
            return -1;
        }
        return 1+max(getHeightOfTree(root.left),getHeightOfTree(root.right));
    }
}
