# NullPointerException при автораспаковке
Исключение `NullPointerException` возникает при попытке автораспаковки `null`-объекта:
```java
Integer boxed = null;
int unboxed = boxed; // Бросает NullPointerException
```