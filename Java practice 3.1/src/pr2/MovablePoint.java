package pr2;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveDown() {
        this.y = y-ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x = x-xSpeed;
    }

    @Override
    public void moveRight() {
        this.x = x+xSpeed;
    }

    @Override
    public void moveUp() {
        this.y = y + ySpeed;
    }
}

