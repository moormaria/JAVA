## Практика #2: Невозможность наследования final класса
Классы, объявленные с модификатором final, запрещено использовать в качестве суперклассов. Это делает их недоступными для наследования.
### Пример:
```java
final class FinalClass {
    public void showMessage() {
        System.out.println("Это метод final-класса.");
    }
}
```
### Ошибка при попытке наследования:
```plaintext
error: cannot inherit from final FinalClass
```
