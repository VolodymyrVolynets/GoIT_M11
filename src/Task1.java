import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {

    public static void main(String[] args) {
        List<String> names = List.of("John", "Doe", "Jane", "Smith", "Bob", "Alice");
        System.out.println(oddNameEnumerated(names));
    }

    // Possible to use StringBuilder and for loop
    private static String oddNameEnumerated(List<String> names) {
        return IntStream.range(0, names.size())
                .filter((i) -> i % 2 == 1)
                .mapToObj(index -> String.format("%d. %s", index, names.get(index)))
                .collect(Collectors.joining(" "));
    }
}
