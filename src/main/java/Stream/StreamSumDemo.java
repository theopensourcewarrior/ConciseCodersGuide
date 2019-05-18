package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSumDemo
{

    public static void main(String[] args)
    {
        getIntegerSum();

        getLongSum();

        getDoubleSum();
    }

    private static void getIntegerSum()
    {
        final Integer[] listValues =
        {
            1, 2, 3, 4
        };

        final List<Integer> numberList = new ArrayList<>(Arrays.asList(listValues));

        final int listSum = numberList.stream().collect(Collectors.summingInt(element -> element));

        System.out.println("Integer List Sum: " + listSum);
    }

    private static void getLongSum()
    {
        final Long[] listValues =
        {
            1L, 2L, 3L, 4L
        };

        final List<Long> numberList = new ArrayList<>(Arrays.asList(listValues));

        final long listSum = numberList.stream().collect(Collectors.summingLong(element -> element));

        System.out.println("Long List Sum: " + listSum);
    }

    private static void getDoubleSum()
    {
        final Double[] listValues =
        {
            1.0, 2.0, 3.0, 4.0
        };

        final List<Double> numberList = new ArrayList<>(Arrays.asList(listValues));

        final double listSum = numberList.stream().collect(Collectors.summingDouble(element -> element));

        System.out.println("Double List Sum: " + listSum);
    }
}
