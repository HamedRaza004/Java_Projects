abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
