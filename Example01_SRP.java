// S - Принцип единственной ответственности (Single Responsibility Principle):
// Добавьте новый класс OrderLogger, который будет отвечать только за логирование информации о заказах. 
// Теперь класс Order будет отвечать только за размещение заказа, а OrderLogger - за запись логов.

package Task1_DZ;

import java.time.LocalDate;

class Order {
    private String numberOrder;

    public Order(String numberOrder) {
        this.numberOrder = numberOrder;        
    }

    public String getOrder() {
        return numberOrder;
    }

    @Override
    public String toString() {        
        return "Заказ номер: " + numberOrder; 
    }

}

class OrderLogger {

    private Order order;
    private LocalDate ld;

    public OrderLogger() {
        System.out.println("Логгер Создан!");        
    }

    public void loggOrder(Order order) {
        System.out.println(order + " принят -> " + ld.now());
    }
}

public class Example01_SRP {
    public static void main(String[] args) {
        Order order1 = new Order("1230495");
        Order order2 = new Order("123030455695");

        OrderLogger orderLogger = new OrderLogger();
        orderLogger.loggOrder(order1);
        orderLogger.loggOrder(order2);

    }
    
}
