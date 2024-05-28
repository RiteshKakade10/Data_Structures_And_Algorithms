import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CatAndMouse {

    static String catAndMouse1(int x, int y, int z) {
        int dx=Math.abs(z-x);
        int dy=Math.abs(z-y);
        String str1=" ";
        
        if(dx<dy)
        {
            str1=("Cat A");
        }
        else if(dx>dy)
        {
            str1=("Cat B");
        }
        else
        {
            str1=("Mouse C");
        }
        return str1;

    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //CatAndMouse obj1=new CatAndMouse();
        int x=4;
        int y=6;
        int z=5;

        System.out.println(catAndMouse1(x,y,z));
    }
}
