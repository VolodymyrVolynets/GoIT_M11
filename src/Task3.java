import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        List<String> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(arr));
        String result = lst.stream()
                .map(i -> i.split(", "))
                .flatMap(Arrays::stream)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
