public class TryCatch {

    public static void main(String[] args) {
        int arraySize = -5; // Negative array size

        try {
            int[] array = new int[arraySize]; //  create an array with negative size
            System.out.println("Array created successfully.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Negative array size!");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

