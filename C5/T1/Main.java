import unit4.collectionsLib.IntNode;

public class Main {
    public static void main(String[] args) {
        IntNode lst1 = new IntNode(5);
        lst1 = new IntNode(5, lst1);

        IntNode lst2 = new IntNode(5);
        lst2 = new IntNode(5, lst2);

        System.out.println(isSame(lst1, lst2));
    }

    public static boolean isSame(IntNode lst1, IntNode lst2) {
        IntNode pos1 = lst1;
        IntNode pos2 = lst2;
        while (pos1 != null && pos2 != null) {
            if (pos1.getValue() != pos2.getValue()) {
                return false;
            }
            pos1 = pos1.getNext();
            pos2 = pos2.getNext();
        }
        if (pos1 == null && pos2 == null) {
            return true;
        }
        return false;
    }
}