/* Task
Given an integer,N , print 
its first 10 multiples. 
Each multiple Nxi  (where 1<=i<=10) 
should be printed on a new line in the form:
N x i = result.
this is that i added
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=1;i<=10;i++)
        {   
           int sum= N*i;
            System.out.printf(N +" x "+i+ " = " +sum+"\n");
        }
        sc.close();
    }
}
