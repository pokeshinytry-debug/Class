public class Main {
    public static void main(String[] args) {
        System.out.println(call("heloF12"));
    }

    public static boolean call(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (!(str.charAt(0) >= 'a' && str.charAt(0) <= 'z') &&
            !(str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')) {
            return false;
        }
        return call(str.substring(1));
    }
}