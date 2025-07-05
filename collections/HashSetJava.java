

import java.util.HashSet;
import java.util.Set;

public class HashSetJava {
    public static void main(String[] args) {
        HashSet a = new HashSet();
        a.add(1.2);
        a.add(1.2);
        a.add(true);
        a.add("teste");
        a.add('x');

        System.out.println(a.remove("teste"));

        System.out.println(a.size());
        System.out.println(a);

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        a.addAll(nums);
        System.out.println(a);

        a.retainAll(nums);
        System.out.println(a);


    }
}
