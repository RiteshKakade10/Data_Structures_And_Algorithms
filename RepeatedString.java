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

class RepeatedString {
    public static long repeatedString(String s, long n) {
    long  tfs=n/s.length();
    long rem=n%s.length();
    
    char[] c=s.toCharArray();
    long count=0;
    
    for(int i=0;i<s.length();i++){
        if(c[i]=='a'){
            count++;
        }
        
    }
    count*=tfs;
    
    for(int i=0;i<rem;i++){
        if(c[i]=='a'){
            count++;
        }
    }
     return count;
    }
   

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
