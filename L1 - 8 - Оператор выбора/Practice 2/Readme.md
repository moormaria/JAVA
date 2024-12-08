```java
int i = 0;
int value = 2;

switch (value) {
    case 1:
        i = 1;
        break;
    case 2:
        i = 2; // Здесь нет break, выполнение продолжается
    case 3:
        i = 3; // Это тоже выполнится
        break;
    default:
        i = 4;
}

System.out.println("i = " + i);
```
### Объяснение:
В данном коде switch ведет себя следующим образом:
1. Начинается с проверки case 1:, если value == 1, то i будет установлено в 1 и break завершит выполнение switch.
2. Если value != 1, то проверяется case 2:, и поскольку value == 2, переменной i присваивается 2. Так как break отсутствует, выполнение продолжится с case 3:.
3. Для case 3: присваивается 3 к i, и затем выполняется break, что завершает выполнение switch.
4. Если value не соответствует ни одному из case, выполняется default, где i устанавливается в 4.
Без break в case 2, case 3 также выполняется и изменяет значение i.

### Пример кода:

#### Код 1: Примеры использования различных типов в `switch`

```java
public class SwitchExampleTypes {
    public static void main(String[] args) {
        // Пример с int
        int intValue = 1;
        switch (intValue) {
            case 1:
                System.out.println("Integer value is 1");
                break;
            case 2:
                System.out.println("Integer value is 2");
                break;
            default:
                System.out.println("Integer value is not 1 or 2");
        }

        // Пример с String
        String stringValue = "hello";
        switch (stringValue) {
            case "hello":
                System.out.println("String value is 'hello'");
                break;
            case "world":
                System.out.println("String value is 'world'");
                break;
            default:
                System.out.println("String value is neither 'hello' nor 'world'");
        }

        // Пример с enum
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Today is not Monday or Friday");
        }
    }

    enum Day {
        MONDAY, FRIDAY, SUNDAY
    }
}
```

#### Код 2: Примеры использования различных типов в `switch`
```java
public class SwitchExampleBreak {
    public static void main(String[] args) {
        int i = 0;
        int value = 2;

        switch (value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2; // Здесь нет break, выполнение продолжается
            case 3:
                i = 3; // Это тоже выполнится
                break;
            default:
                i = 4;
        }

        System.out.println("i = " + i);
    }
}
```
Код 2 продемонстрирует поведение switch при отсутствии break, что может привести к случайным или не желаемым значениям в i.