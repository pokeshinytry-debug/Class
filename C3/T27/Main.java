public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 2};
        System.out.println(call(arr1, 2));
    }

    public static int call(int[] arr, int n) {
        return callHelp(arr, n, 0);
    }

    public static int callHelp(int[] arr, int n, int index) {
        if (index < arr.length) {
            if (arr[index] == n) {
                return callHelp(arr, n, index+1) + 1;
            }
            return callHelp(arr, n, index+1);
        }
        return 0;
    }
}