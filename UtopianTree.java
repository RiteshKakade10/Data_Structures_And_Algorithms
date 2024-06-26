/*
*PROBLEM STATEMENT=Utopian_Tree
*******************
Problem Description
*******************
Spring: The tree doubles in height.
Summer: The tree grows by 1 meter.
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

    public static int utopianTree(int n) {
    int treeHeight=1;
    for(int i=1;i<=n;i++)
    {
        if(i%2==1)
        {
            treeHeight=(treeHeight*2);
        }
        if(i%2==0){
            treeHeight=(treeHeight+1);
        }
    }
    return treeHeight;
    }

}

public class UtopianTree {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.utopianTree(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
