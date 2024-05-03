/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
  
    public static void main (String[] args) {
        System.out.println ("Diameter of a binary tree ");
        System.out.println ("Diameter definition: The diameter of a binary tree is the number of nodes on the longest path between any two leaf nodes.");

        Solution solution = new Solution();
        
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        int[] nums1_new =  solution.twoSum(nums1, target1);
        System.out.println(Arrays.toString(nums1_new));

        int[] nums2 = {3,2,4};
        int target2 = 6;
        int[] nums2_new =  solution.twoSum(nums2, target2);
        System.out.println(Arrays.toString(nums2_new));

    }
}
