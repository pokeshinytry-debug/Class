public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 4, 5};
        System.out.println(call(arr1, arr2));
    }

    public static boolean call(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {return false;}
        return callHelp(arr1, arr2, 0);
    }

    public static boolean callHelp(int[] arr1, int[] arr2, int index) {
        if (index == arr1.length) {
            return true;
        }
        if (arr1[index] != arr2[index]) {
            return false;
        }
        return callHelp(arr1, arr2, index+1);
    }
}