import java.io.*;
import java.util.*;

public class Looping_Review{

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    scan.nextLine();
    for(int i = 0; i < T ;i++)
    {
        String even = "";
        String odd = "";
        String S = scan.nextLine();
        for(int j = 0; j < S.length(); j++)
        {
            
            if(j % 2 == 0)
            {
                even += Character.toString(S.charAt(j));
            }
            else
                odd += Character.toString(S.charAt(j));
        }
        System.out.println(even + " " + odd);
    }
}
}
