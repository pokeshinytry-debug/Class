public class Main {
    public static void main(String[] args) {
        func('a', 'z');
    }

    public static void func(char start, char end) {
        if (start != end-1) {
            System.out.print((char)(start+1));
            func(++start, end);
        }
    }
}