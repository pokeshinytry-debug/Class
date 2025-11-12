import unit4.collectionsLib.IntNode;

public class Main {
    public static void main(String[] args) {
        IntNode lst = new IntNode(5);
        lst = new IntNode(6, lst);
        lst = new IntNode(7, lst);
        lst = new IntNode(9, lst);
        lst = new IntNode(9, lst);
        lst = new IntNode(6, lst);
        lst = new IntNode(7, lst);
        lst = new IntNode(5, lst);
        // {6, 9, 5, 9, 6, 5}
        removeDups(lst);

        while (lst != null) {
            System.out.print(lst.getValue() + " ");
            lst = lst.getNext();
        }
    }

    public static void removeDups(IntNode lst) {
        IntNode pos = lst;
        while (pos != null) {
            remove(pos, pos.getValue());
            pos = pos.getNext();
        }
    }

    public static void remove(IntNode lst, int num) {
        IntNode pos = lst;
        while (pos.getNext() != null) {
            if (pos.getNext().getValue() == num) {
                pos.setNext(pos.getNext().getNext());
            } else {
                pos = pos.getNext();
            }
        }
        // if (lst.getValue() == num) {
        //     lst = lst.getNext();
        // }
    }
}