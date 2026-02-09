public class MyCircle {
    private MyPoint center;
    private int radius = 1;
    
    public MyCircle() {
        this.radius = 1;
        this.center = new MyPoint(0, 0);

    }

    public MyCircle(int x, int y, int radius) {
        this.radius = radius;
        this.center = new MyPoint(x, y);
    }

    public MyCircle(MyPoint center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int GetCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int GetCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] GetCenterXY() {
        int a[] = new int[2];
        a[0] = this.center.getX();
        a[1] = this.center.getY();
        return a;
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    public String toString() {
        return "MyCircle[center=" + this.center + ",radius=" + this.radius + "]";
    }
    public double getArea() {
        return (this.radius * this.radius * Math.PI);
    }

    public double getCircumference() {
        return (2 * this.radius * Math.PI);
    }

    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
}
