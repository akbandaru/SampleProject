package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println(printMedianOfArrays());
    }

    static double printMedianOfArrays(int[] input1, int[] input2) {
        Stream<int[]> inputStream = Stream.of(input1);
        OptionalDouble doubleValue = Stream.concat(Stream.of(input1), Stream.of(input2))
                .flatMapToInt(Arrays::stream)
                .average();
        return doubleValue.getAsDouble();
    }

    static void convertOneDimenstionAryToMultiDimension() {
        int m = 3;
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> inputAry = new ArrayList<>();
        for (int i=0; i<6; i++) {
            inputAry.add(String.valueOf(i));
        }
        int start = 0;
        while (start < inputAry.size()) {
            int end = Math.min(inputAry.size(), start + m);
            result.add(inputAry.subList(start, end));
            start += m;
        }

        System.out.println("\\n");
        System.out.println(Arrays.deepToString(result.toArray()));
    }
}