package Level2;
class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Radius  " + radius);
        System.out.println("Area    " + String.format("%.2f", area));
    }
}

 class CircleMain{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        System.out.println("Default Radius ");
        c1.displayArea();

        System.out.println("Custom Radius ");
        c2.displayArea();
    }
}