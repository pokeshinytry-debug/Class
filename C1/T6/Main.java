public class Main {
    public static void main(String[] args) {
        double[] arr = {10.0, 1.5, 10.0, 2.3, 0.7, 4.6, 5.0, 3.3, 7.8, 8.1, 9.9, 10.0};
        func(arr);
    }

    public static void func(double[] arr) {
        printMax(arr, 0, Max(arr, 0, arr[0]));
    }

    public static void printMax(double[] arr, int index, double max) {
        if (index < arr.length) {
            if (arr[index] == max) {
                System.out.print(index + " ");
            }
            printMax(arr, index+1, max);
        }
    }

    public static double Max(double[] arr, int index, double max) {
        if (index < arr.length) {
            return Max(arr, index+1, Math.max(max, arr[index]));
        }
        return Math.max(max, arr[index-1]);
    }
}