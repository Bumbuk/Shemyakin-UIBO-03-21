import java.util.Scanner;
public class Number3 {
    public static void main(String[] args) {//номер 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int size = sc.nextInt();
        System.out.println("Введите элементы массива");
        int[] arr = new int[size] ;
        int sum = 0;
        for(int i = 0;i<size;i++){
           arr[i] = sc.nextInt();
           sum+=arr[i];
        }
        System.out.println("Сумма элементов массива(for) = " + sum);
        System.out.println("Среднее арифимитечкое = " + sum/size);
        sum = 0;

        int i = 0;
        while(i<size){
            sum+=arr[i];
            i++;
        }
        System.out.println("Сумма элементов массива(while) = " + sum);
        sum = 0;

        int j = 0;
        do{
            sum+=arr[j];
            j++;
        }while(j<size);
        System.out.println("Сумма элементов массива(do while) = " + sum);
    }//номер 3
}
