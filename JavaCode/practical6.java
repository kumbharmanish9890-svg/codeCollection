import java.util.function.*;

public class practical6 {
    public static void main(String args[]) {
    //    Consumer<String> c = name ->
    // System.out.println(name);

    // c.accept("Java");

    Supplier<String> s = () -> "Hello Java";

    System.out.println(s.get());

    }
}
