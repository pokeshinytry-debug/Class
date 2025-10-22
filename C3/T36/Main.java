public class Main {

    public static void main(String[] args) {
        call(10);
    }

    public static void call(int n) {
        callHelp(n, 1);
    }
    public static void callHelp(int n, int c) {
        if (c <= n/2) {
            if (n % c == 0) {
                System.out.print(c + " ");
            }
            callHelp(n, c+1);
        }
    }
}