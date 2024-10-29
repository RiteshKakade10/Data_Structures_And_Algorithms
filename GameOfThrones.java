import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import javofa.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class GameOfThrones {
    public static String gameOfThrones(String s) {
    int[] CHAR = new int[26];
        int oddCount = 0;
        for(int i=0;i<s.length();i++) {
            CHAR[s.charAt(i)-97]++; 
        }
        for(int i=0;i<26;i++){
            oddCount += CHAR[i]%2;
        }
        if(s.length()%2==0 && oddCount == 0) return "YES";
        if(s.length()%2!=0 && oddCount == 1) return "YES";
        return "NO";
    }

    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
