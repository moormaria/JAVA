## Пример использования подкласса класса OutputStream для метода write(int)
### Описание:
Класс OutputStream является абстрактным классом для всех потоков вывода. Метод write(int) используется для записи одного байта данных в поток. Пример использования класса FileOutputStream для записи данных в файл.
### Пример:
```java
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(65);  // Записываем байт, который соответствует символу 'A'
            fos.write(66);  // Записываем байт, который соответствует символу 'B'
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
### Пояснение:
- В этом примере используется FileOutputStream, который является подклассом OutputStream.
- Метод write(int) записывает один байт в поток. В примере записываются байты, представляющие символы 'A' и 'B' (их ASCII значения 65 и 66 соответственно).