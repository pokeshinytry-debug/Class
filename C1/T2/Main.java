public class Main {
    public static void main(String[] args) {
        char[] arr = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
        System.out.println(func(arr));
    }

    public static boolean func(char[] arr) {
        return funcHelp(arr, 0, arr.length - 1);
    }

    public static boolean funcHelp(char[] arr, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (arr[start] != arr[end]) {
            return false;
        }
        return funcHelp(arr, start + 1, end - 1);
    }
}