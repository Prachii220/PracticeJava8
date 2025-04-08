package StreamAPi_PracticeExamples;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

    public static void main(String[] args) {

        /*
        FILTER - predicate
        boolean value function
        e->e<10
         */

        /*
        map(Function
        each element operation
         */

        List<String> names = List.of("Prachi","Priya","Praveen","Aditi","Raunak","Prachi");
        List<String> newNames = names.stream().filter(e -> e.startsWith("P")).collect(Collectors.toList())
                .stream().distinct().collect(Collectors.toList());
        System.out.println(newNames);


        // naam ka stream bnaya , usme filter lga diya or e is a predicate usme condition kga kr , collect kr liya
        // naam ka list , new name ek new obj bna name ka


        // MAP---

        //returning square of a num

        List<Integer> numbers = List.of(1,4,5,8,0,2);
        List<Integer> newNum = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNum);


        List<Integer> num = List.of(1,3,4,5,4,22,8);
        num.forEach(e->{
            System.out.println("Square of nums using foreach: ");
            System.out.println(e*e);

        });

        //the shortest way-
        List<Integer> num1 = List.of(1,8,9);
        num1.forEach(System.out::println);

        List<String> namess= List.of("Prachi", "Prachi SIngh");
        namess.forEach(System.out::println);


        // sorting
        System.out.println("Sorted elements");
        numbers.stream().sorted().forEach(System.out::println);

        //finding min
        System.out.println("Printing min elements: ");
        Integer integer= numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(integer);

        //printing max
        System.out.println("Printing max elements: ");
        Integer integer1 = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(integer1);


        //by myself
        //priniting charactercount





    };

    }

