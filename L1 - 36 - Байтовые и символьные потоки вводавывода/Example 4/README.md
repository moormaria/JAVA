## Зачем нужен интерфейс AutoCloseable? Пример использования
### Ответ:
Интерфейс AutoCloseable позволяет объектам автоматически закрываться, когда они больше не нужны, например, в блоке try-with-resources. Это упрощает управление ресурсами (например, файлами, соединениями с базой данных), поскольку гарантирует закрытие ресурсов после использования.
### Пример:
```java
import java.io.FileInputStream;
import java.io.IOException;

public class AutoCloseableExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            // Читаем файл
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
### Пояснение:
- В данном примере FileInputStream реализует интерфейс AutoCloseable, поэтому он будет автоматически закрыт после выполнения блока try.
- Благодаря этому, вам не нужно вручную вызывать метод close(), что предотвращает утечку ресурсов и упрощает код.
- Блок try-with-resources гарантирует, что все ресурсы, поддерживающие интерфейс AutoCloseable, будут закрыты после использования.