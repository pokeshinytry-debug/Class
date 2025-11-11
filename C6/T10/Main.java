import unit4.collectionsLib.IntNode;

public class Main {
    public static void main(String[] args) {
        IntNode lst = getFrom(1, 10);
        while (lst != null) {
            System.out.print(lst.getValue() + " ");
            lst = lst.getNext();
        }
    }

    public static IntNode getFrom(int beginner, int num) {
        IntNode lst = null;
        for (int i = (beginner+num)-1; i >= beginner; i--) {
            lst = new IntNode(i, lst);
        }
        return lst;
    }
}