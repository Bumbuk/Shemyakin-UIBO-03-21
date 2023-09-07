import java.util.Arrays;

public class Number6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i<10; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Не отсортированный массив:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nОтсортированный массив:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}