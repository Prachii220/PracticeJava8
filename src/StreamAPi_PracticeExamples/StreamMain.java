package StreamAPi_PracticeExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        //1. Create a list and filter all even nums
        // 2.

        List<Integer> list= List.of(1,3,4,2,11,45);
        System.out.println("Printing List:  "+list);

        List<Integer> list1= Arrays.asList(1,3,4,2,11,4,40,9);
        System.out.println("List1 items "+list1);


        //without stream
        //this is called boiler plate code
        List<Integer> listEven = new ArrayList<>();
        for (Integer i : list1){
            if(i%2==0){
                listEven.add(i);
            }}System.out.println("Even nums without using stream "+listEven);


        //with using stream api
        Stream<Integer> stream = list1.stream(); // here Stream is an interface
        List<Integer> newlist= stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even nums using stream: "+newlist);

        // collect(Collectors.toList());= As a list ye data collect krta rhega , jo filter ho kr aarha hoga i wala


        // using stream in more short way
        List<Integer> newList2= list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("even num using more short way for lambda expression: "+newList2);

        List<Integer> newlist3=list1.stream().filter(i->i<10).collect(Collectors.toList());
        System.out.println("num using more short way for lambda expression: "+newlist3);


        List<Integer> newlist4=list1.stream().filter(i->i<10).collect(Collectors.toList())
                .stream().distinct().collect(Collectors.toList());
        System.out.println("distinctnum using more short way for lambda expression: "+newlist4);






    }
}
