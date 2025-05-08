// Parent class
public class Polymorpshim {
    public void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }

    public void area(int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    public void display() {
        System.out.println("Displaying Shape");
    }
}


class Circle extends Polymorpshim {
    public void display() {
        System.out.println("Displaying Circle");
    }
    public static void main(String[] args) {
        Polymorpshim myShape = new Polymorpshim();
        myShape.area(5);
        myShape.area(5, 10);

        Polymorpshim myCircle = new Circle();
        myCircle.display();
    }
}

