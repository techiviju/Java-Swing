		// Basic Split Program
/*
import java.util.Scanner;
public class Solution
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        
        String arr[]=a.split("\\s");
        for(String s:arr)
        {
            System.out.println(s);
        }
    }
}
*/

		// SOLUTION 

import java.util.*;

public class Split
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine().trim();
        String token[]=s.split("[^a-zA-Z]+");
        
        if(s.length()== 0)
        {
            System.out.println(0);
        }
        else{
            System.out.println(token.length);
        }
        for(String word:token){
            System.out.println(word);
        }
        sc.close();
    }
}