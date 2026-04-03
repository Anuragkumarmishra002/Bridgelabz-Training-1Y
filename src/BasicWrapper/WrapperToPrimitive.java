package BasicWrapper;

public class WrapperToPrimitive {
    public static void main(String[] args) {
        // Given Double object
        Double wrapperValue = 45.67;

        // Convert to primitive double
        double doubleValue = wrapperValue.doubleValue();
        int intValue = wrapperValue.intValue();
//    Display all values
        System.out.println("Wrapper object value " + wrapperValue);
        System.out.println("Primitive double value" + doubleValue);
        System.out.println("Primitive int value (casted) " + intValue);
    }
}