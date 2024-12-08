package anotherpackage;

import mypackage.AccessModifiersExample;

public class SubClass extends AccessModifiersExample {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // example.privateField; // Ошибка: privateField недоступен
        // example.packagePrivateField; // Ошибка: package-privateField недоступен
        // example.protectedField; // Ошибка: доступ к protected через родителя невозможен
        System.out.println(example.publicField); // Public доступен

        SubClass sub = new SubClass();
        System.out.println(sub.protectedField); // Protected доступен через наследование
        sub.displayProtected();
    }
}
