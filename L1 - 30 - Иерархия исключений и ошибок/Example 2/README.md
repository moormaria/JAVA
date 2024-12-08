# Практика #2: Примеры генерации и обработки исключений

## Пример обработки исключений:

### 1. **ArithmeticException**: Возникает при ошибке арифметической операции, например, делении на ноль.

```java
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Деление на ноль вызывает ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");
        }
    }
}
```

### 2. ArrayIndexOutOfBoundsException: Возникает, когда индекс массива выходит за пределы допустимого диапазона.

```java
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            int value = arr[5]; // Индекс выходит за пределы массива
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс массива вне диапазона");
        }
    }
}
```

### 3.IllegalArgumentException: Возникает, когда передан недопустимый аргумент в метод.
```java
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            setAge(-5); // Невозможное значение возраста
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: Неверный аргумент");
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }
}
```
### 4. ClassCastException: Возникает при неправильном приведении типов объектов.
```java
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = new String("Hello");
        try {
            Integer num = (Integer) obj; // Неверное приведение типа
        } catch (ClassCastException e) {
            System.out.println("Ошибка: Невозможность приведения типов");
        }
    }
}
```

### 5. NullPointerException: Возникает, когда пытаемся обратиться к методу или полю объекта, который равен null.
```java
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); // str равен null, вызывает NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Попытка обращения к null");
        }
    }
}
```

### Вывод:
Каждое из исключений продемонстрировано в соответствующем примере. Важно помнить, что исключения могут быть обработаны с помощью блока try-catch, чтобы предотвратить аварийное завершение программы и обработать ошибку корректным образом.