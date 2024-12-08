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
