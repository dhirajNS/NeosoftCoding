
import java.lang.reflect.Method;
        import java.lang.reflect.InvocationTargetException;

public class ReflectionMockingExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        PrivateMethodClass myObject = new PrivateMethodClass();

        // Get the Class object
        Class<?> myClass = myObject.getClass();

        try {
            // Get the private method
            Method privateMethod = myClass.getDeclaredMethod("privateMethod",int.class, int.class);
            privateMethod.setAccessible(true); // Make it accessible

            // Mock the private method
            String mockedResult = "Mocked Private Method";
            //privateMethod.invoke(myObject,10,20);

            // Access the private method to verify the result
            String result = (String) privateMethod.invoke(myObject,10,20);
            System.out.println("Result: " + result);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
