import java.util.ArrayList;
import java.util.List;

public class Task2 {
    private static List<String> listToCapitalSorted(List<String> lst) {
        // copy list to avoid mutation of initial
        List<String> result = new ArrayList<>(lst);
        return result
                .stream()
                .map(item -> item.toUpperCase())
                .sorted()
                .toList();
    }

    public static void main(String[] args) {
        List<String> names = List.of("John", "doe", "Jane", "smith", "bob", "alice");
        System.out.println(listToCapitalSorted(names));
    }
}
