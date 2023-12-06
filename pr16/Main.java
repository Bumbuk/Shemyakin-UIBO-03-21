package pr16;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("C:\\Users\\i212\\IdeaProjects\\untitled\\src\\pr16\\pr16.txt", false))
        {
            FileReader reader = new FileReader("C:\\Users\\i212\\IdeaProjects\\untitled\\src\\pr16\\pr16.txt");
            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
            // запись всей строки
            System.out.println("Введите текст который вы хотите видеть в файле ( для зхавершения нажмите cntr+D");
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNextLine()){
                String text = scanner.nextLine();
                writer.write(text);
            }



        }

        catch(IOException ex){
            System.out.println("Не удаётся открыть файл");
        }

    }
}


