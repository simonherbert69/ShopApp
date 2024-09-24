import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        Predicate<Integer> p1 = i -> i > 1;
        System.out.println("p1 " + p1);
        Stream.of(1,2,3,4)
               .filter( p1.and(i -> i < 4)) //1
        //        .filter(i -> i < 4&& i>1)
                .forEach(System.out::println);

        System.out.println(p1.test(1));

        Predicate<Integer> lesserthan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserthan.test(17));
    }
}
