public class BST {

    private Node root;


    Node arrayToBST(String names[], int start, int end) {


        if (start > end) {
            return null;
        }


        int mid = (start + end) / 2;
        Node node = new Node(names[mid]);


        node.setLeft(arrayToBST(names, start, mid - 1));


        node.setRight(arrayToBST(names, mid + 1, end));

        return node;
    }


    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getKey() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }
}
