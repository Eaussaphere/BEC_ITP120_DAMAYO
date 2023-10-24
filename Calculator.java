public class Calculator {
    enum Shape {
        CIRCLE(3.14), SQUARE(1.0), TRIANGLE(0.5);

        private double constant;

        Shape(double constant) {
            this.constant = constant;
        }

        public double calculateArea(double... params) {
            if (this == CIRCLE && params.length == 1) {
                return constant * params[0] * params[0];
            } else if (this == SQUARE && params.length == 1) {
                return constant * params[0] * params[0];
            } else if (this == TRIANGLE && params.length == 2) {
                return constant * params[0] * params[1];
            } else {
                return -1.0; // Invalid parameters
            }
        }

        public double calculatePerimeter(double... params) {
            if (this == CIRCLE && params.length == 1) {
                return 2 * constant * params[0];
            } else if (this == SQUARE && params.length == 1) {
                return 4 * constant * params[0];
            } else if (this == TRIANGLE && params.length == 3) {
                return constant * (params[0] + params[1] + params[2]);
            } else {
                return -1.0; // Invalid parameters
            }
        }
    }

    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            double[] params = { 5.0, 4.0, 3.0 }; // Example parameters for the shapes

            System.out.println("Shape: " + shape);
            System.out.println("Area: " + shape.calculateArea(params));
            System.out.println("Perimeter: " + shape.calculatePerimeter(params));
            System.out.println();
        }
    }
}
