package src;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            System.out.println("(a)dd, (d)emove, (g)et, (p)rint, (l)ength, (r)everse, (q)uit");
            String input = scanner.nextLine();

            switch (input.charAt(0)) {
                case 'a':
                    System.out.println("Enter a number to add:");
                    int dataToAdd = scanner.nextInt();
                    scanner.nextLine();
                    linkedList.add(dataToAdd);
                    System.out.println("Added element");
                    break;
                case 'd':
                    System.out.println("Enter an index to delete:");
                    int indexToDelete = scanner.nextInt();
                    scanner.nextLine();
                    linkedList.delete(indexToDelete);
                    System.out.println("Deleted element");
                    break;
                case 'g':
                    System.out.println("Enter an index to get:");
                    int indexToGet = scanner.nextInt();
                    scanner.nextLine();
                    int gotElement = linkedList.get(indexToGet);
                    System.out.println("Element:");
                    System.out.println(gotElement);
                    break;
                case 'p':
                    List<Integer> elements = linkedList.getAllElements();
                    System.out.println("Linked list:");
                    for (int element : elements) {
                        System.out.println(element + " ");
                    }
                    break;
                case 'l':
                    int length = linkedList.length();
                    System.out.println("Length:");
                    System.out.println(length);
                    break;
                case 'r':
                    linkedList.reverse();
                    System.out.println("Linked list reversed");
                    break;
                case 'q':
                    System.out.println("Quitting");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
