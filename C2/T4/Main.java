public class Main {
    public static void main(String[] args) {
        //System.out.println(call(123));
        call(123456789);
    }

    public static void call(int n) {
        if (n > 0) {
            call(n/10);
            if (n % 2 == 0) {
                System.out.print(n%10);
            }
        }
    }
}