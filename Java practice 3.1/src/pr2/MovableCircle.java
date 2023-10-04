package pr2;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        this.center.ySpeed+=center.ySpeed;
    }

    @Override
    public void moveRight() {
        this.center.x+=center.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x-=center.xSpeed;
    }

    @Override
    public void moveDown() {
        this.center.y-=center.ySpeed;
    }
}
