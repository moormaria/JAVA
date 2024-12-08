## Интерфейс с модификатором private:
```java
private interface Interface {
    // ...
}
```
### Область видимости:
Интерфейсы не могут быть объявлены как private на верхнем уровне, поскольку private предназначен для ограничения доступа на уровне класса. Если попытаться объявить интерфейс с модификатором private на верхнем уровне, компилятор выдаст ошибку:
```java
Modifier 'private' not allowed here
```
Однако, если интерфейс вложен в класс, он может быть объявлен private. В этом случае он будет доступен только внутри внешнего класса.
### Пример вложенного интерфейса:
```java
class Outer {
    private interface InnerInterface {
        void method();
    }

    public static class InnerClass implements InnerInterface {
        @Override
        public void method() {
            System.out.println("Метод InnerInterface");
        }
    }
}
```