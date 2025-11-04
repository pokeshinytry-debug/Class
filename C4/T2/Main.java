
import unit4.collectionsLib.IntNode;

public class Main {
    public static void main(String[] args) {
        IntNode lst = new IntNode(3);
        lst = new IntNode(22, lst);
        lst = new IntNode(4, lst);
        lst = new IntNode(4, lst);
        lst = new IntNode(4, lst);
        lst = new IntNode(3, lst);
        lst = new IntNode(6, lst);
        lst = new IntNode(6, lst);
        lst = new IntNode(5, lst);
        lst = new IntNode(4, lst);
        System.out.println(getRow(lst, 4));
    }

    public static int getRow(IntNode lst, int num) {
        int count = 0;
        IntNode pos = lst;
        if (pos.getvalue() == num) {
            count++;
        }
        while (pos.getNext() != null) {
            if (pos.getvalue() != num && pos.getNext().getvalue() == num) {
                count++;
            }
            pos = pos.getNext();
        }
        return count;
    }
}