package shapes;

import util.InputRy;

public class CircleApp {

    public static void main(String[] args) {

        InputRy inputRy = new InputRy();

        double userRadius = InputRy.getDouble("Enter radius of circle: ");

        Circle circle = new Circle(userRadius);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumferance());
    }
}
