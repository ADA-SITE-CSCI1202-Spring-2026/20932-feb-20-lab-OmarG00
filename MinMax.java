import java.util.Scanner;

public class MinMax {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

      
        int[] cmdArray = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            cmdArray[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Command-line Min: " + findMin(cmdArray));
        System.out.println("Command-line Max: " + findMax(cmdArray));
        int[] result1 = findMinMax(cmdArray);
        System.out.println("Command-line Min & Max: " + result1[0] + ", " + result1[1]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] scanArray = new int[n];
        for (int i = 0; i < n; i++) {
            scanArray[i] = scanner.nextInt();
        }
        System.out.println("Scanner Min: " + findMin(scanArray));
        System.out.println("Scanner Max: " + findMax(scanArray));
        int[] result2 = findMinMax(scanArray);
        System.out.println("Scanner Min & Max: " + result2[0] + ", " + result2[1]);
    }

}
