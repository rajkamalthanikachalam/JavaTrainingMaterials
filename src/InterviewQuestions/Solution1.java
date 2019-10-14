package InterviewQuestions;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1{

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[] calories = new int[n];
for(int calories_i=0; calories_i < n; calories_i++){
    calories[calories_i] = in.nextInt();
}
// your code goes here
//sorting of calories[]
for(int i =0;i<calories.length-1;i++)
{
    for(int j=0;j<calories.length-1-i;j++)
    {
        if(calories[j]<calories[j+1])
        {
            int temp=calories[j];
            calories[j]=calories[j+1];
            calories[j+1]=temp;
        }
    }
}
double already=0;
double sum=0;
for(int i=0;i<calories.length;i++)
{
    sum=sum+((double)calories[i]*Math.pow(2,already));
    already++;
}
System.out.println((int)sum);
}
}