## Три двойные кавычки
### Ответ:
Три двойные кавычки (""") используется в JAVA (начиная с JAVA 15) для текстовых блоков.
### Пример:
```java
String multiline = """
    Первая строка
    Вторая строка
    Третья строка
    """;
```
### Пример с текстовым блоком:
```java
public class TextBlocksDemo {
    public static void main(String[] args) {
        String block = """
            Hello,
            This is a multi-line
            string in Java.
            """;

        System.out.println(block);
    }
}
```
#### Вывод:
```
Hello,
This is a multi-line
string in Java.
```