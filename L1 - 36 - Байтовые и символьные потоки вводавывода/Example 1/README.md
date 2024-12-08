# Практика #1: Пример использования подкласса класса InputStream для метода read()

### Описание:

Класс `InputStream` является абстрактным классом, и его метод `read()` используется для чтения байтов из потока. Например, одним из подклассов `InputStream` является класс `FileInputStream`, который используется для чтения данных из файла.

### Пример:

```java
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);  // Преобразуем байт в символ и выводим
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
### Пояснение:
- В этом примере мы используем FileInputStream, который является подклассом InputStream.
- Метод read() считывает по одному байту за раз из файла до тех пор, пока не достигнет конца файла (метод read() возвращает -1).
- Мы преобразуем байт в символ, чтобы вывести его на экран.