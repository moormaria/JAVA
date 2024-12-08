## Практика #1
### Какие типы переменных могут быть в `switch`?
1. **Целые числа (`int`, `byte`, `short`, `char`)**:
   ```java
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
```
2. Строки (String):
```java
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
```
3. Перечисления (enum):
```java
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
```
4. Литералы (char):
```java
char charValue = 'a';
switch (charValue) {
    case 'a':
        System.out.println("Char value is 'a'");
        break;
    case 'b':
        System.out.println("Char value is 'b'");
        break;
    default:
        System.out.println("Char value is neither 'a' nor 'b'");
}
```