// a Java program to find the sum of all elements in an integer array.
public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};  

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];  
        }
        System.out.println("Sum: " + sum);
    }
}

