// Класс, находящийся в пакете "mypackage"
package mypackage;

class AccessModifiersExample {
    // Поле с модификатором private - доступно только в этом классе
    private String privateField = "Private Field";

    // Поле без спецификатора (package-private) - доступно только в этом пакете
    String packagePrivateField = "Package-Private Field";

    // Поле с модификатором protected - доступно в этом пакете и в подклассах
    protected String protectedField = "Protected Field";

    // Поле с модификатором public - доступно из любого класса
    public String publicField = "Public Field";

    // Метод для демонстрации private
    private void displayPrivate() {
        System.out.println("This is a private method");
    }

    // Метод для демонстрации package-private
    void displayPackagePrivate() {
        System.out.println("This is a package-private method");
    }

    // Метод для демонстрации protected
    protected void displayProtected() {
        System.out.println("This is a protected method");
    }

    // Метод для демонстрации public
    public void displayPublic() {
        System.out.println("This is a public method");
    }

    // Демонстрация работы всех спецификаторов
    public void demonstrateAccess() {
        System.out.println(privateField);
        displayPrivate();

        System.out.println(packagePrivateField);
        displayPackagePrivate();

        System.out.println(protectedField);
        displayProtected();

        System.out.println(publicField);
        displayPublic();
    }
}

// Класс для проверки package-private, protected и public доступа
public class Main {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // example.privateField; // Ошибка: privateField недоступен
        // example.displayPrivate(); // Ошибка: метод displayPrivate недоступен

        // Доступ к package-private членам
        System.out.println(example.packagePrivateField);
        example.displayPackagePrivate();

        // Доступ к protected членам (в том же пакете)
        System.out.println(example.protectedField);
        example.displayProtected();

        // Доступ к public членам
        System.out.println(example.publicField);
        example.displayPublic();
    }
}
