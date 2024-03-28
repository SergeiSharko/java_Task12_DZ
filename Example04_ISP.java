// I - Принцип разделения интерфейса (Interface Segregation Principle):
// Создайте интерфейсы Driveable и Flyable. Реализуйте их в соответствующих классах Car и Airplane.
// Теперь классы Car и Airplane зависят только от интерфейсов, которые они используют.

package Task1_DZ;

interface Driveable {

    public void drive();
    
}

interface Flyable {

    public void fly();
    
}

class Car implements Driveable {    
    
    public void drive() {
        System.out.println("Едем");
    }

}

class Airplane implements Driveable, Flyable {

    @Override
    public void fly() {
        System.out.println("Летим");
    }

    @Override
    public void drive() { 
        System.out.println("Немного едем");        
    }
}

public class Example04_ISP {
    public static void main(String[] args) {
        Car car = new Car();
        Airplane airplane = new Airplane();

        car.drive();
        System.out.println("-----------------");
        airplane.drive();
        airplane.fly();
        airplane.drive();        
    }    
}
