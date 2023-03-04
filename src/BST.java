public class BST {

    private Node root;


    Node arrayToBST(String[] names, int start, int end) {


        if (start > end) {
            return null;
        }

        int mid = (int)Math.floor((names.length+1)/2);
        System.out.println(mid);

        //int mid = (start + end) / 2;
        Node node = new Node(names[mid-1]);

        addToTree(names, node, 0);

        //node.setLeft(arrayToBST(names, start, mid - 1));



        //node.setRight(arrayToBST(names, mid + 1, end));

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


    void inOrder(Node current,String[] names) {
    /*   if (current != null){
           inOrder(current.getRight());
           System.out.println(current.getKey());
           inOrder(current.getLeft());*/
           for (int i = 0; i < names.length; i++) {
               // Imprime cada elemento del arreglo utilizando System.out.println()
               System.out.println(names[i]);}
       }

}
