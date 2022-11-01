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
/* Compiler Message
Success
Input (stdin)


2
Expected Output


2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/
