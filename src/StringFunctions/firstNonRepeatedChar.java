package StringFunctions;
//Find first non repeated chararcters


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeatedChar {

    public static void main(String[] args) {

        String input = "PrachiistheBest";

        LinkedHashMap<String, Long> collect1 = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting()));

                System.out.println(collect1);

        String s = collect1.entrySet().stream().filter(e -> e.getValue() == 1)
                .map(e -> e.getKey()).findFirst().get();

        System.out.println(s);

    }
}
