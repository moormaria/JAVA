# Использование var и type inference

## Описание
`var` — это механизм автоматического вывода типа переменной, добавленный в Java 10. Тип переменной определяется на этапе компиляции на основе присвоенного значения.

### Пример
```java
var number = 42; // Определяется как int
var text = "Привет"; // Определяется как String
System.out.println(number + " " + text);
```

### Особенности:
1. `var` нельзя использовать для переменных без начального значения.
2. Тип переменной определяется статически и не может изменяться в дальнейшем.