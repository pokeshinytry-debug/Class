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
        System.out.println(oddEven(lst));
    }

    public static char oddEven(IntNode lst) {
        int countOdd = 0;
        int countEven = 0;
        IntNode pos = lst;
        while (pos != null) {
            if (pos.getValue() % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            pos = pos.getNext();
        }
        if (countOdd > countEven) {
            return 'z';
        } else if (countEven > countOdd) {
            return 'y';
        }
        return 's';
    }
}