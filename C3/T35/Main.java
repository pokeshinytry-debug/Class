public class Main {
    public static void main(String[] args) {
        call('w', 'z');
    }

    public static void call(char a, char b) {
        if (a != (b+1)) {
            System.out.print(a + " ");
            call((char)(a+1), b);
        }
    }
}