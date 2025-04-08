package StringFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString {
    public static void main(String[] args) {

        String input = "PPrachiii";
        List<String> duplicateElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e-> e.getValue()>1)
                .map(Map.Entry :: getKey)
                .collect(Collectors.toList())
                ;
        System.out.println("duplicateElements in given string: "+duplicateElements);
    }
}
