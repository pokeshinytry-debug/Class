import unit4.collectionsLib.IntNode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntNode lst = getLst();
        while (lst != null) {
            System.out.print(lst.getValue() + " ");
            lst = lst.getNext();
        }
    }

    public static IntNode getLst() {
        Scanner input = new Scanner(System.in);

        IntNode lst = null;
        int num = 0;

        while (num != -999) {
            System.out.print("Number: ");
            num = input.nextInt();

            if (num != -999) {
                lst = new IntNode(num, lst);
            }
        }
        return lst;
    }
}