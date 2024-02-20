package src;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:");
            System.out.println("(a)dd, (r)emove, (g)et, (p)rint, (l)ength, (q)uit");
            String input = scanner.nextLine();

            switch (input.charAt(0)) {
                case 'a':
                    System.out.println("Enter a number to add:");
                    int dataToAdd = scanner.nextInt();
                    scanner.nextLine();
                    linkedList.add(dataToAdd);
                    break;
                case 'r':
                    System.out.println("Enter an index to remove:");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine();
                    linkedList.remove(indexToRemove);
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
                case 'q':
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
