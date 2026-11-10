import java.util.*;
public class practical6 {
    public static void main(String args[]) {
        Predicate<Integer> p = n -> n > 10;
        System.out.println(p.test(20)); // Output: true
    }
}
