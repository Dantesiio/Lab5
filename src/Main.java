import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    static BST tree = new BST();
    public static void main(String[] args) {
    menu();


    }

    /*
    * Metodo menu donde se ingresan los datos que contendra el bst
    * */
    public static void menu() {
        int opcion = 0;
       // do {
            System.out.println("Menu\n" + "1.Ingresar Datos\n" + "0.Salir");
            System.out.print("Ingrese una opción: ");
            opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos a almacenar:");
                    String names = input.nextLine();
                    String[] array = names.split(" ");
                    System.out.println("los Datos almacenados son" + Arrays.toString(array));
                    int n = names.length();
                    Node root = tree.arrayToBST(array, 0, n - 1);
                    System.out.println("inorder traversal of constructed BST");
                    System.out.println("la root es : "+ root.getKey());
                    tree.inOrder(root,array);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor intente de nuevo.");
            }

  //      } while (opcion != 0);

    }
}
