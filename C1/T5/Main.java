public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 5, 6, 7, 8, 9};
        func(arr);
    }

    public static void func(int[] arr) {
        funcHelp(arr, 1);
    }

    public static void funcHelp(int[] arr, int index) {
        if (index < arr.length) {
            if (arr[index] < arr[index-1]) {
                System.out.print(arr[index] + " ");
            }
            funcHelp(arr, index+1);
        }
    }
}