/*
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

Example
scores =[12,24,10,24];
Return(Integer_Array);
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

class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
    
    int highest=scores.get(0);
    int lowest=scores.get(0);
    
    int highestCount=0;
    int LowestCount=0;
    
    for(int i=1;i<scores.size();i++)
    {
        if(scores.get(i)>highest)
        {
            highest=scores.get(i);
            highestCount++;
        }
        if(scores.get(i)<lowest)
        {
            lowest=scores.get(i);
            LowestCount++;
        }
    }
    
    List<Integer> l1=new ArrayList<Integer>();
    l1.add(highestCount);
    l1.add(LowestCount);
    return l1;
    }

    public static void main(String[] args){
        List<Integer> scores=new ArrayList();
        scores.add(10);
        scores.add(24);
        scores.add(12);
        scores.add(24);
        System.out.println(breakingRecords(scores));


    }
}
