public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        func(arr);
    }

    public static void func(int[] arr) {
        funcHelp(arr, 0);
    }

    public static void funcHelp(int[] arr, int index) {
        if (index < arr.length) {
            if (index % 2 == 0) {
                System.out.print(arr[index] + " ");
            }
            funcHelp(arr, index+1);
        }
    }
}