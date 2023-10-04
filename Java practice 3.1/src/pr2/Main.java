package pr2;

public class Main {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(10,15,5,4,5);
        System.out.println(circle);
        circle.moveDown();
        circle.moveRight();
        System.out.println(circle);
    }
}
