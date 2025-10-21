public class Main {
    public static void main(String[] args) {
        System.out.println(call("{ello123s"));
    }

    public static int call(String str) {
        if (str.length() > 0) {
            if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
                return call(str.substring(1))+1;
            }
            return call(str.substring(1));
        }
        return 0;
    }
}