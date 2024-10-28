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

class Quick_Sort {
   public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
    int pivot = arr.get(0);
    List<Integer> right = new ArrayList<>();
    List<Integer> left = new ArrayList<>();
    
    for(int i=1;i<arr.size();i++){
        if (arr.get(i)>pivot) {
             right.add(arr.get(i));
        }
        if (arr.get(i)<pivot) {
             left.add(arr.get(i));
        }
    }
    List<Integer> result  = new ArrayList<>();
    result.addAll(left);
    result.add(pivot);
    result.addAll(right);
    return result;
    
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.quickSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
