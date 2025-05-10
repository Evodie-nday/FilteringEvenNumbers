import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,7,6,12,15);
        List<Integer>evenNumbers = EvenNumberFilter.filterEvenNumbers(numbers);
        System.out.println("Even numbers: " + evenNumbers);
    }
}