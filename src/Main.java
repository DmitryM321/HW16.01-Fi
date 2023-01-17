import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Main {
    public static void main(String[] args) {
        int a = 25;
        Double x = 2.2;

        System.out.println("Задание 1");
        Predicate<Integer> b = new Predicate<Integer>() {
            @Override
            public boolean test(Integer b) {
                return b >= 0;
            }
        };
        System.out.println(b.test(a));
        Predicate<Integer> b1 = c -> c >= 0;
        System.out.println(b1.test(a));

        System.out.println("Задание 2");
        Consumer<String> nameMan = new Consumer<String>() {
            @Override
            public void accept(String nameMan) {
                System.out.println("Hello, " + nameMan);
            }
        };
        nameMan.accept("Vit");
        Consumer<String> nameMan2 = s -> System.out.println("Hello, " + s);
        nameMan2.accept("Kit");

        System.out.println("Задание 3");
        Function<Double, Long> x1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double x) {
                return x.longValue();
            }
        };
        System.out.println(x1.apply(x));
        Function<Double, Long> x2 = Double::longValue;
        System.out.println(x2.apply(x));

        System.out.println("Задание 4");
        Supplier<Integer> random1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };
        System.out.println(random1.get());
        Supplier<Integer> random2 = () -> (int) (Math.random() * 100);
        System.out.println(random2.get());

        System.out.println("Задание 5");
    }
    public static <T, U> Function<T, U> ternaryOperator(  // 2 типа на вход, Function<T, U> то что вернется
            Predicate<? super T> condition,  // это аргументы кот-ые передаются
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> {  // t = Function<T, U>
            if (condition.test(t)) {
                return ifTrue.apply(t);
            } else {
             return ifFalse.apply(t);
            }
        };
   //  ternaryOperator(condition, ifTrue, ifFalse).apply();
    }
}






