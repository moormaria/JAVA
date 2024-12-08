## Default и Static методы

### Интерфейс с методами
- `default` метод — может быть переопределен в классе.
- `static` метод — вызывается через имя интерфейса и не доступен через объект.

### Пример вызовов:
1. Вызов static метода: `MyInterface.staticMethod()`.
2. Вызов default метода через объект: `obj.defaultMethod()`.
3. Вызов оригинального default метода: `MyInterface.super.defaultMethod()`.