/*
#Problem Statement
The "Birthday Cake Candles" problem is a common coding challenge where you are given a list of integers representing the heights of candles on a birthday cake. Your goal is to determine the number of candles that have the maximum height.
Here is how you can solve this problem in Java:

1]Find the maximum height of the candles.
2]Count how many candles have that maximum height.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
     public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);
        int total = 0;
        for(int i: candles) {
            if (i > max) {
                max = i;
                total = 1;
            } else if (i == max) {
                total++;
            }
        }
        return total;
    }

}

public class birthdayCandles{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
