// L - Принцип подстановки Барбары Лисков (Liskov Substitution Principle):
// Создайте класс Square, который наследуется от класса Rectangle. Убедитесь, что все методы, работающие с Rectangle,
// также корректно работают с Square, не изменяя их поведения.

package Task1_DZ;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

class Square implements Shape {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * width;
    }

}

public class Example03_LSP {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 10);
        System.out.println(rect.calculateArea());
        Square sq = new Square(15);
        System.out.println(sq.calculateArea());
    }
}
