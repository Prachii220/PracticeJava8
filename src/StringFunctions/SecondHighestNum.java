package StringFunctions;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNum {

    public static void main(String[] args) {

        int[] numbs = {1,2,3,99,33,34,92,98};

        Integer numms1 = Arrays.stream(numbs).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();

        Integer numms2 = Arrays.stream(numbs).boxed()
                .sorted()
                .skip(1).findFirst().get();

        System.out.println("In Descending order:"+numms1);
        System.out.println("In Ascending order: " +numms2);
    }
}
