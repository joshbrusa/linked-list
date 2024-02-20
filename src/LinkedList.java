package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Our linked list.
 */
class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    /**
     * Appends a node to the linked list. Loops over the nodes until a next is
     * null.
     */
    public void add(int data) {
        Node newNode = new Node(data);

        // if empty make head the new node
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    /**
     * Removes a node at a given index. 2 pointers, one at current and one at
     * previous. If our current equals our desired node, then we just update
     * the previous.next to be the current.next.
     */
    public void remove(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        } else if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex == index) {
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
            currentIndex++;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    /**
     * Gets all of the elements in the linked list. Just builds an array while
     * looping over our linked list and returns it.
     */
    public List<Integer> getAllElements() {
        List<Integer> elements = new ArrayList<>();

        Node current = head;

        while (current != null) {
            elements.add(current.data);
            current = current.next;
        }

        return elements;
    }

    /**
     * Gets an element at a given index. Loops through our linked list, when
     * we get to our desired index return the data.
     */
    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        Node current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex == index) {
                return current.data;
            }
            current = current.next;
            currentIndex++;
        }

        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    /**
     * Loops through the linked list and returns the length.
     */
    public int length() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}
