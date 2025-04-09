import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        /*for(int i=1;i<n+1;i++){
            String s=sc.nextLine();               //  ******************* commented lines of codes are some other ways of trying or attempts of the problem - not work *********************
            //System.out.println(i+s);
        }*/
        int i = 1;  // for line number
		while (sc.hasNext())         //dircetly from input that it has next any next input to get from the user.
         {
			System.out.println(i++ + " " + sc.nextLine());   // here i is incremented directly and the input string is directly printed while getting the input.
		}
		sc.close();
    }
}
