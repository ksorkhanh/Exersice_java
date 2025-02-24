package Phan2;

public class MyCircle {
    private MyPoint center;
    private int radius = 1; // Giá trị mặc định

    // Constructor mặc định
    public MyCircle() {
        this.center = new MyPoint(0, 0);
    }

    // Constructor với tọa độ x, y và bán kính
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Constructor với MyPoint làm tâm và bán kính
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ", center=" + center + "]";
    }
}