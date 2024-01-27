import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();

        set1.add(2);
        set1.add(1);
        set1.add(4);
        set1.add(3);

        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        System.out.println(set);
        System.out.println(set1);
        System.out.println("----------------");
        // Hợp của 2 tập:
        Set<Integer> union = new HashSet<Integer>(set);
        union.addAll(set1);
        System.out.println(union);
        System.out.println("----------------");
        // Giao của 2 tập
        Set<Integer> intersection = new HashSet<Integer>(set);
        intersection.retainAll(set1);
        System.out.println(intersection);
        System.out.println("----------------");
        // Khác của 2 tập:
        Set<Integer> diferrence = new HashSet<Integer>();
        diferrence.removeAll(set1);
        System.out.println(diferrence);
    }
}