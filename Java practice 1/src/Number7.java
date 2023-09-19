import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        int fact = 1;
        for(int i = 1;i<=number;i++){
           fact*=i;
        }
        System.out.println("Факториал числа "+ number + " = " + fact);
    }
}
