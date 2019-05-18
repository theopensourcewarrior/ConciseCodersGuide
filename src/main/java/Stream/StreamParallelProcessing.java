package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StreamParallelProcessing
{

    public static void main(String[] args)
    {
        //Array of values
        final Integer[] arrayValues =
        {
            1, 2, 3, 4, 5
        };

        //Add values to list
        final List<Integer> valueList = new ArrayList<>(Arrays.asList(arrayValues));

        //Create a thread safe list so we can add to it in parallel
        final List<Integer> resultList = new CopyOnWriteArrayList<>();

        //Perform forEach in parallel
        valueList.stream().parallel().forEach(currValue ->
        {
            resultList.add(getExpensiveResult(currValue));
        });

        //Loop over the result, note values will be out of order since
        //work occurred in parallel
        for (int currResultValue : resultList)
        {
            System.out.println("Result Value: " + currResultValue);
        }
    }

    private static int getExpensiveResult(int valueToProcess)
    {
        //Note: this method would perform work that is CPU intensive
        return valueToProcess + 100;
    }
}
