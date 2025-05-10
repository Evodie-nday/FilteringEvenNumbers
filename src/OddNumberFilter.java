import java.util.List;
import java.util.stream.Collectors;


public class OddNumberFilter {
    public static List<Integer> oddNumberFilter(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }
}
