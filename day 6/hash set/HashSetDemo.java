package day6;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        // Creating a HashSet (without generics — allows mixed data types)
        HashSet set = new HashSet<>();
        set.add("thirunavukkarasu");
        set.add(19);
        set.add('m');
        set.add(356.123);
        set.add(true);
        set.add("Thirunavukkarasu");  // duplicate (ignored)
        set.add(null);

        System.out.println(set);


        set.add("Sarah");
        System.out.println(set);


        System.out.println(set.contains("Thirunavukkarasu"));
        System.out.println(set.contains(100));


        System.out.println("Size: " + set.size());


        System.out.println("Is Empty? " + set.isEmpty());


        set.clear();
        System.out.println(set);
        System.out.println("Is Empty? " + set.isEmpty());



        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(array));
        System.out.println(set1);


        List<Integer> tempList = new ArrayList<>(set1);
        for (int i = 0; i < tempList.size(); i++) {
            System.out.println(tempList.get(i));
        }


        for (Integer temp : set1) {
            System.out.println(temp);
        }


        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

