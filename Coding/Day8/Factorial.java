// Question:https://www.hackerrank.com/challenges/30-recursion/problem
import java.io.*;
import java.util.*;
public class Solution {
    static int factorial(int a){
        if(a==1){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }
}

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(factorial(n));
    }
}
