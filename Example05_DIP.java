// D - Принцип инверсии зависимостей (Dependency Inversion Principle):
// Создайте абстракцию Logger, которая будет иметь методы для логирования различных типов сообщений.
// Затем создайте классы FileLogger и DatabaseLogger, реализующие эту абстракцию.
// Теперь классы, которые требуют логирования, будут зависеть только от Logger, а не от конкретных реализаций.

package Task1_DZ;

interface Logger {    
    public void logMessage();    
}

class FileLogger implements Logger {

    @Override
    public void logMessage() {
        System.out.println("log записан в файл");
    }
}

class DatabaseLogger implements Logger {

    @Override
    public void logMessage() {
        System.out.println("log записан в базу данных");
    }
}

class WriterOfLog {
    private Logger log;

    public WriterOfLog(Logger log) {
        this.log = log;        
    }

    public void createWriterOfLog() {
        System.out.println("Писать логи готов");
        log.logMessage();
    } 
}

public class Example05_DIP {
    public static void main(String[] args) {
        WriterOfLog wl = new WriterOfLog(new FileLogger());
        wl.createWriterOfLog();
        WriterOfLog wl2 = new WriterOfLog(new DatabaseLogger());
        wl2.createWriterOfLog();
    }
    
}
