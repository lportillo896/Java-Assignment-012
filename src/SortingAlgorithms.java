/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 */
import java.util.Scanner;
public class SortingAlgorithms {
    public static void main (String[] args) {
        int size, i, j, temp;
        int[] arr = new int[50];
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the size of your array: ");
        size = console.nextInt();

        System.out.print("Enter numbers for your array: ");
        for (i = 0; i < size; i++) {
            arr[i] = console.nextInt();
        }

        System.out.print("Selection Sorting...\n");
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Array after sorting is:\n");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
