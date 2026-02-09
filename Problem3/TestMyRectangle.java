public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 4);
        MyPoint p2 = new MyPoint(5, 8);
        MyRectangle rectangle = new MyRectangle(p1, p2);
        
        System.out.println("Top Left Point: " + rectangle.getTopLeft());
        System.out.println("Bottom Right Point: " + rectangle.getBottomRight());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());
    }
