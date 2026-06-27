public class TestPoint {

    public static void main(String[] args) {

        Point p1 = new Point();

        p1.display();

        p1.setXY(10,20);

        p1.display();

        Point p2 = new Point(30,40);

        p2.display();
    }
}