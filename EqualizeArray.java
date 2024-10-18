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

class  EqualizeArray{
    public static int equalizeArray(List<Integer> arr) {
    final int UPPER_UNIT=100;
    int[] intArray=new int[100];
    int maxCount=0,lengthOfArr=arr.size();
    
    for(int element:arr){
        intArray[element-1]+=1;
    }
    
    for(int i=0;i<UPPER_UNIT;i++){
        if(intArray[i]>maxCount){
            maxCount=intArray[i];
        }
    }
    return lengthOfArr - maxCount;
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

        int result = Result.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
