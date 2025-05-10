import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,50,5,9,11,16);
        List<Integer>evenNumbers = EvenNumberFilter.filterEvenNumbers(numbers);
        List<Integer>oddNumbers = OddNumberFilter.oddNumberFilter(numbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Orginal list: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Original list: " + numbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}