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




/*
Problem Statement
#The Hrudle Run
A video player plays a game in which the character competes in a hurdle race. 
Hurdles are of varying heights, and the characters have a maximum height they can jump. 
There is a magic potion they can take that will increase their maximum jump height by  unit for each dose.
 How many doses of the potion must the character take to be able to jump all of the hurdles. 
 If the character can already clear all of the hurdles, return .

Example
The character can jump  unit high initially and must take  doses of potion to be able to jump all of the hurdles.

#Logic
if k>max return 0
else return max-k

*/

class Result {
    public static int hurdleRace(int k, List<Integer> height) {
        int max=Collections.max(height);
    
    if(k>max)
    {
        return 0;
    }
    else{
        return max-k;
    }

    }

}

public class TheHrudleRun {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.hurdleRace(k, height);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
