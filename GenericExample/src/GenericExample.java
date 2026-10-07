// Generic Interface
interface Container<T> {
    void display(T value);
}

// Generic Class implementing the interface
class Box<T> implements Container<T> {

    private T value;

    Box(T value) {
        this.value = value;
    }

    @Override
    public void display(T value) {
        System.out.println("Value: " + value);
    }

    public T getValue() {
        return value;
    }
}

// Main class
public class GenericExample {

    // Generic Method
    public static <T> void printValue(T value) {
        System.out.println("Generic Method: " + value);
    }

    public static void main(String[] args) {

        // Generic Class with Integer
        Box<Integer> intBox = new Box<>(100);
        System.out.println("Integer: " + intBox.getValue());
        intBox.display(200);

        // Generic Class with String
        Box<String> stringBox = new Box<>("Hello");
        System.out.println("String: " + stringBox.getValue());
        stringBox.display("Java");

        // Generic Method
        printValue(50);
        printValue("Welcome");
        printValue(10.5);
    }
}
