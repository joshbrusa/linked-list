package src;

/**
 * The node of our linked list. The data can be any data type we like, but here
 * we will just make it an integer. The next is the next node in our linked
 * list.
 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
