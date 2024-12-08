# Работа с `final` методами и классами

### Практика #1: Невозможность переопределения `final` метода
Методы, объявленные с модификатором `final`, запрещено переопределять в подклассах. Попытка переопределить такой метод вызывает ошибку компиляции.

#### Пример:
```java
class Parent {
    public final void displayMessage() {
        System.out.println("Это метод суперкласса, который нельзя переопределить.");
    }
}
```
### Ошибка при попытке переопределения:
```plaintext
error: displayMessage() in Child cannot override displayMessage() in Parent
overridden method is final
```