import java.util.stream.Stream;

public class Task4 {
    private static Stream<Long> randomGenerator (long a, long c, long m, long seed) {
        return Stream.iterate(a, i -> (a * i + c) % m);
    }
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed;
        randomGenerator(a, c, m, System.currentTimeMillis()).limit(10).forEach(i -> System.out.println(i));
    }
}
