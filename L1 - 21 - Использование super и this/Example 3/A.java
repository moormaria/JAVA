class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0, 0, 0); // Вызов конструктора с 3 аргументами
    }

    public A(int a) {
        this(a, 0, 0); // Вызов конструктора с 3 аргументами
    }

    public A(int a, int b) {
        this(a, b, 0); // Вызов конструктора с 3 аргументами
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1; // Общее поведение
    }
}
