package pr3;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("red",true,5);
        double t = c1.getArea();
        System.out.println(t);
        System.out.println(c1.getPerimeter());

        Rectangle p1 = new Rectangle("red",false,5,3);
        System.out.println(p1.getArea());
    }
}
