import unit4.collectionsLib.IntNode;

public class Main {
    public static void main(String[] args) {
        IntNode lst = new IntNode(10);
        lst = new IntNode(9, lst);
        lst = new IntNode(8, lst);
        lst = new IntNode(7, lst);
        lst = new IntNode(6, lst);
        lst = new IntNode(5, lst);
        lst = new IntNode(4, lst);
        lst = new IntNode(3, lst);
        lst = new IntNode(2, lst);
        lst = new IntNode(1, lst);
        System.out.println(isSorted(lst));
    }

    public static boolean isSorted(IntNode lst) {
        IntNode pos = lst;
        while (pos.getNext() != null) {
            if (pos.getvalue() > pos.getNext().getvalue()) {
                return false;
            }
            pos = pos.getNext();
        }
        return true;
    }
}