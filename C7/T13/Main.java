import unit4.collectionsLib.IntNode;

public class Main {
    public static void main(String[] args) {
        IntNode lst = new IntNode(5);
        lst = new IntNode(6, lst);
        lst = new IntNode(9, lst);
        // {9, 6, 5}
        removeIndex(lst, 0);

        while (lst != null) {
            System.out.print(lst.getValue() + " ");
            lst = lst.getNext();
        }
    }

    public static void removeSomething(IntNode lst) {
        int len = getLength(lst);
        if (len % 2 == 0) {

        }
    }

    public static int getLength(IntNode lst) {
        IntNode pos = lst;
        int count = 0;
        while (pos != null) {
            count++;
            pos = pos.getNext();
        }
        return count;
    }

    public static void removeIndex(IntNode lst, int index) {
        IntNode pos = lst;
        int count = 1;
        while (pos.getNext() != null) {
            if (count == index) {
                pos.setNext(pos.getNext().getNext());
            } else {
                pos = pos.getNext();
            }
            count++;
        }
        if (index == 0) {
            lst.setNext(lst.getNext().getNext());
        }
    }
}