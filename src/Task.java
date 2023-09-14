import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Task {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        // in other cases stream closes after count() method
        List<T> listA = first.toList();
        List<T> listB = second.toList();

        long minSize = Math.min(listA.size(), listB.size());

        // Create stream of indexes, stream size = minSize * 2 and then check if index is even or odd and gives specific item
        return Stream.iterate(0, x -> x + 1)
                .limit(minSize * 2)
                .map(i -> i % 2 == 0 ? listA.get(i / 2) : listB.get(i / 2));
    }

    public static void main(String[] args) {
        Stream<Integer> a = Stream.of(1,2,3,4);
        Stream<Integer> b = Stream.of(5,6,7,8);

        zip(a, b).forEach(System.out::println);
    }
}
