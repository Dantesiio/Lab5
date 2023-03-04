public class BST {

    private Node root;


    Node arrayToBST(String[] names, int start, int end) {


        if (start > end) {
            return null;
        }

        int mid = (int)Math.floor((names.length+1)/2);


        //int mid = (start + end) / 2;
        Node node = new Node(names[mid-1]);

        addToTree(names, node, 0);

        //root.setLeft(arrayToBST(names, start, mid - 1));



        //root.setRight(arrayToBST(names, mid + 1, end));

        return node;
    }
    public void addToTree(String[] array, Node root, int cont){
        Node node;
        if(cont < array.length){
            node = new Node(array[0]);
            addNode(root, node);
        }
    }
    public void addNode(Node current, Node node){
        if(node.getKey().compareTo(current.getKey()) < 0){
            if(current.getLeft()==null){
                current.setLeft(node);}
            else{   addNode(current.getLeft(),node);}
        }
        if(node.getKey().compareTo(current.getKey()) > 0){
            if(current.getRight()==null){
                current.setRight(node);}
            else{addNode(current.getRight(),node);}
        }
    }
    private void add(Node current, Node node){
        if(node.getKey().compareTo(current.getKey()) < 0){
            //Meter a la izquierda
            if(current.getLeft() == null){
                current.setLeft(node);
            }else{
                add(current.getLeft(), node);
            }
        }else if(node.getKey().compareTo(current.getKey()) > 0){
            //Meter a la derecha
            if(current.getRight() == null){
                current.setRight(node);
            }else{
                add(current.getRight(), node);
            }

        }else{
            //No hacer nada
        }
    }


    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.getLeft());
        System.out.print(root.getKey() + " ");
        inOrder( root.getRight());
    }
    public static int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());

        return 1 + Math.max(leftDepth, rightDepth);
    }

}
