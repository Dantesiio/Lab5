import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    static BST tree = new BST();
    public static void main(String[] args) {
    menu();


    }

    public static void menu() {
        int opcion = 0;
        do {
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
                    Node root = tree.arrayToBST(names, 0, n - 1);
                    System.out.println("Preorder traversal of constructed BST");
                    tree.preOrder(root);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor intente de nuevo.");
            }

        } while (opcion != 0);

    }
}
