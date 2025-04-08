package StringFunctions;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharsCount {
    public static void main(String[] args) {

        String input = "Prachi Priya";
        Map<String, Long> Charscount = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(Charscount);

        /*
        Detailed Flow:
Splitting: "Prachi Priya" → ["P", "r", "a", "c", "h", "i", " ", "P", "r", "i", "y", "a"]

Stream: Stream is created from the array of characters.

Grouping: The stream is grouped by each character.

Counting: The count of each character is calculated.

Result: A map is produced with characters as keys and counts as values.
         */

    }
}

