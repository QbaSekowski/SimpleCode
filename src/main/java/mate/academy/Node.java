package mate.academy;

class Node {
    public int data;
    public Node next = null;

    public static int getNth(Node n, int index) throws Exception {
        int counter = 0;
        while (n != null) {
            if (counter == index) {
                return n.data;
            }
            n = n.next;
            counter++;
        }
        throw new Exception("Index out of bounds");
    }
}
