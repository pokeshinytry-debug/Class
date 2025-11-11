import java.util.Random;
import unit4.collectionsLib.IntNode;

public class Main {
    public static void main(String[] args) {
        IntNode lst = getNotAppear(getRandom());
        while (lst != null) {
            System.out.print(lst.getValue() + " ");
            lst = lst.getNext();
        }
    }

    public static boolean isIn(IntNode lst, int num) {
        while (lst != null) {
            if (lst.getValue() == num) {
                return false;
            }
            lst = lst.getNext();
        }
        return true;
    }

    public static IntNode getRandom() {
        Random rnd = new Random();
        IntNode lst = new IntNode(rnd.nextInt(89) + 10);
        int n = 0;
        for (int i = 0; i < 50; i++) {
            n = rnd.nextInt(89) + 10;
            if (isIn(lst, n)) {
                lst = new IntNode(n, lst);
            }
        }
        return lst;
    }

    public static IntNode getNotAppear(IntNode lst) {
        IntNode newLst = null;
        for (int i = 99; i >= 10; i--) {
            if (!isIn(lst, i)) {
                newLst = new IntNode(i, newLst);
            }
        }
        return newLst;
    }
}