// O - Принцип открытости/закрытости (Open/Closed Principle):
// Добавьте новый метод calculateDiscount() в класс Customer, который будет рассчитывать скидку для заказов. 
// Это позволит расширить функциональность класса без изменения его исходного кода.

package Task1_DZ;

class Customer {

    public double calculateDiscount(double price) {
        return price;
    }
}

class DiscountCustomer extends Customer {

    @Override
    public double calculateDiscount(double price) {
        return super.calculateDiscount(price) * 0.8;
    }
}

class VIPCustomer extends DiscountCustomer {

    @Override
    public double calculateDiscount(double price) {        
        return super.calculateDiscount(price) * 0.8;
    }
}

public class Example02_OCP {
    public static void main(String[] args) {     

        System.out.println(new Customer().calculateDiscount(1000));
        System.out.println(new DiscountCustomer().calculateDiscount(1000));
        System.out.println(new VIPCustomer().calculateDiscount(1000));
    }

}
