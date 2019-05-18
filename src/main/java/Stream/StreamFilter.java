package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter
{

    public static void main(String[] args)
    {
        final Integer[] arrayValues =
        {
            1, 2, 3, 4, 5
        };

        final List<Integer> valueList = new ArrayList<>(Arrays.asList(arrayValues));

        final long numValues = valueList.stream()
                .filter(value -> value > 3).count();

        final List<Integer> valuesAboveThree = valueList.stream()
                .filter(value -> value > 3).collect(Collectors.toList());

        final boolean threeExists = valueList.stream()
                .anyMatch(value -> value == 3);

        final boolean allValuesMatchThree = valueList.stream()
                .allMatch(value -> value == 3);

        System.out.println("Number of values greater than three: " + numValues);
        System.out.println("List of values greater than three: " + valuesAboveThree);
        System.out.println("Does three exist in valueList: " + threeExists);
        System.out.println("Are all values in valueList equal to three: " + allValuesMatchThree);

    }
}
