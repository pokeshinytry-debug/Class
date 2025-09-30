public class Main {
    public static void main(String[] args) {
        int n = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(func(arr, n));
    }

    public static int func(int[] arr, int n) {
        return funcHelp(arr, n, arr.length - 1);
    }

    public static int funcHelp(int[] arr, int n, int index) {
        if (index >= 0) {
            if (arr[index] == n) {
                return index;
            }
            return funcHelp(arr, n, index - 1);
        }
        return -1;
    }
}