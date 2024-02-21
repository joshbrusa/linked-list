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
     * Deletes a node at a given index. 2 pointers, one at current and one at
     * previous. If our current equals our desired node, then we just update
     * the previous.next to be the current.next.
     */
    public void delete(int index) {
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

    /**
     * Reverses the linked list. Uses 3 pointers, the previous, current, and
     * next. At the start make the current the head. Then make the next the next
     * node. Now set the pointer to the previous, starting as null. Then step
     * the current and previous. Once current is null stop the loop to prevent
     * out of bounds. At the very end set the head to previous as that will be
     * the head node.
     */
    public void reverse() {
        // if there is no head or next there is no need to reverse
        if (head == null || head.next == null) {
            return;
        }

        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;

            // set the next to the previous
            current.next = previous;

            // step the pointers
            previous = current;
            current = next;
        }

        head = previous;
    }
}
