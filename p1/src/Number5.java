import java.text.DecimalFormat;

public class Number5 {
    public static void main(String[] args) {
        System.out.println("Числа гармочиского ряда: ");
        double numbers = 0;
        DecimalFormat rounding = new DecimalFormat("#.####");
        for(int i=1;i<=10;i++){
            numbers+= (double) 1/i;
            System.out.println(i + ". " + rounding.format(numbers));
        }
    }
}
