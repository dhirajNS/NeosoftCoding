import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
    // Parent class method throwing an unchecked exception
    void method() throws FileNotFoundException {
        // Some code that may throw RuntimeException

        System.out.println("Parent method");
    }
}

class Child extends Parent {
    // Child class overriding the method without declaring any exception
    void method() throws RuntimeException {
        // Overridden method code without any throws declaration
        System.out.println("child method");
    }
}

public class OverridingExcepitons{
    public  static  void main(String args[]) throws IOException {
        Parent p =new Parent();
        p.method();
    }
}
