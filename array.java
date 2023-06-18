/**
 * array
 */
public class array {
    public static void main(String[] args) {
        int[] arr = new int[10]; //int arr[]
        System.out.println(arr.length); // 10

        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr.length); // 5
        System.out.println(arr[3]);

        // Многомерные массивы
        int[] arr2[] = new int[3][5]; // int[][] arr = new int[3][5]
        for (int[] line: arr2) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

    }
}
