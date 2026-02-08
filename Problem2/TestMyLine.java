public class TestMyLine {
    public static void main(String[] args) {
        MyLine line = new MyLine(new MyPoint(1, 1), new MyPoint(2, 2));
        System.out.println("Begin point: " + line.getBegin());
        System.out.println("End point: " + line.getEnd());
        System.out.println("Length of the line: " + line.getLength());
        System.out.println("Gradient of the line: " + line.getGradient());  
    }
}
