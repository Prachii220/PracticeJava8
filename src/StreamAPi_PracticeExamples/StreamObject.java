package StreamAPi_PracticeExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {
        //stream api - collection process
        // collection / group of objects

        //blank stream
        Stream<Object> emptyStream = Stream.empty(); //stream of type object
        emptyStream.forEach(e->{
            System.out.println("Empty Stream "+e);
        });

        //creating stream from Array (we can create stream from array , object, collection
        String names[]= {"Prachi", "Aditi", "Praveen", "Priya", "Sammy", "Bobby"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(p->{
            System.out.println(p);
        });

        //we can use builder patterm
        Stream<Object> builder1 = Stream.builder().build();

        //we can use array
        IntStream arrayStream = Arrays.stream(new int[]{1, 4, 5, 6, 34, 555});
        arrayStream.forEach(o->{
            System.out.println(o);
        });

        // 5. list, set

        List<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(2);
        list1.add(3);
        list1.add(10);

        Stream<Integer> listStream = list1.stream();
        listStream.forEach(e->{
            System.out.println(e);
        });

// there are lots of way to create stream .. these 5 are not the only one.

    }
}
