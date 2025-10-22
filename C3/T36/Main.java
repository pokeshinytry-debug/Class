public class Main {

    public static void main(String[] args) {
        call(123);
    }

    public static void call(int n) {
        callHelp(n, 1);
    }
    public static void callHelp(int n, int c) {
        if (c <= n) {
            if (callHelpHelp(n, c)) {
                System.out.print(c + " ");
            }
            callHelp(n, c+1);
        }
    }
    public static boolean callHelpHelp(int n, int n2) {
        if (n == 0) {return true;}
        if (n < 0) {return false;}
        return callHelpHelp(callHelpHelpHelp(n, n2), n2);
    }
    public static int callHelpHelpHelp(int n, int n2) {
        if (n2 > 0) {
            return callHelpHelpHelp(n, n2-1) - 1;
        }
        return n;
    }
}