package pr14;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Даня");
        friends.add(1,"Катя");
        friends.add("Егор");
        friends.add("Стьёпа");
        friends.add("Саня");
        friends.add("Никита");

        System.out.println(friends.get(1));
        friends.set(1,"Я");
        System.out.printf("У меня %d друзей!\n",friends.size());
        for(String all_friends : friends){
            System.out.println(all_friends);
        }
        friends.remove(5);
        friends.remove("Я");

        if(friends.contains("Даня")){
            System.out.println("В апарате!");
        }

        System.out.printf("У меня осталось %d друзей!\n",friends.size());
        for(String all_friends : friends){
            System.out.println(all_friends);
        }
    }
}

       /* LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.addLast("Великобритания"); // добавляем на последнее место
        states.addFirst("Испания"); // добавляем на первое место
        states.add(1, "Италия"); // добавляем элемент по индексу 1

        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Дания");
        for(String state : states){

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Германия")){

            System.out.println("Список содержит государство Германия");
        }

        states.remove("Германия");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1); // удаление второго элемента

        for(Person p : people){

            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }
    }
    class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
    }*/

        /*ArrayList<String> states = new ArrayList<String>();
        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия"); // добавляем элемент по индексу 1

        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Дания"); // установка нового значения для 2-го объекта

        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){

            System.out.println(state);
        }

        if(states.contains("Германия")){

            System.out.println("Список содержит государство Германия");
        }

        // удалим несколько объектов
        states.remove("Германия");
        states.remove(0);

        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        }
    */



