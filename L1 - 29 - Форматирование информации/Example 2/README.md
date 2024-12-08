```java
import java.io.FileWriter;
import java.io.IOException;

public class FlushExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, ");
            // Метод flush() гарантирует, что данные будут записаны на диск немедленно
            writer.flush();
            writer.write("World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
### Объяснение:
Метод flush() используется для немедленной записи данных, находящихся в буфере, в целевой поток (например, в файл или на экран). Это гарантирует, что данные не будут оставаться в буфере и сразу попадут в конечное хранилище. Обычно он используется, когда нужно убедиться, что данные были записаны в момент вызова, а не в момент закрытия потока.