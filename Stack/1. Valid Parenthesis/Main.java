/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
  
    public static void main (String[] args) {
        System.out.println ("Two Sum problem");
        //System.out.println ("The Two Sum problem asks us to find two numbers in an array that sum up to a given target value. We need to return the indices of these two numbers.");

        Solution solution = new Solution();
        
        String s1 = "()";
        boolean result1 =  solution.isValid(s1);
        System.out.println(result1);

        String s2 = "()[]{}";
        boolean result2 =  solution.isValid(s2);
        System.out.println(result2);



    }
}
