# Практика 2
```java
class A {
    int a1; // По умолчанию (default)
    public int a2; // Public
    protected int a3; // Protected
    private int a4; // Private

    void method1() {
        System.out.println("Default method");
    }

    public void method2() {
        System.out.println("Public method");
    }

    protected void method3() {
        System.out.println("Protected method");
    }

    private void method4() {
        System.out.println("Private method");
    }
}

class B extends A {
    void accessTest() {
        // this.a1; // Доступен, так как default доступ в том же пакете
        // this.a2; // Доступен, так как public доступен для всех
        // this.a3; // Доступен, так как protected доступен для наследников
        // this.a4; // Недоступен, так как private доступен только в классе A

        method1(); // Доступен, так как default доступ в том же пакете
        method2(); // Доступен, так как public доступен для всех
        method3(); // Доступен, так как protected доступен для наследников
        // method4(); // Недоступен, так как private доступен только в классе A
    }
}

class C extends B {
    void accessTest() {
        // Поведение аналогично классу B
    }
}
```
### Пояснения:
**private**:

Поля и методы с модификатором private недоступны для наследников. Они видны только в пределах своего класса.

**protected**:

Поля и методы с модификатором protected доступны для классов в том же пакете и для подклассов, даже если они находятся в других пакетах.

**public**:

Поля и методы с модификатором public доступны всем классам без ограничений.

**Спецификатор по умолчанию (default)**:

Поля и методы без явного модификатора доступны только в пределах того же пакета.

### Пример наследования:
```java
class B extends A {
    void accessTest() {
        method1(); // Доступен, так как default в том же пакете
        method2(); // Доступен, так как public доступен для всех
        method3(); // Доступен, так как protected доступен для наследников
        // method4(); // Недоступен, так как private доступен только в классе A
    }
}
```