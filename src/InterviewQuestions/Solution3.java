package InterviewQuestions;

	
public class Solution3
{
    public static void main(String... args)
    {
        int num = 101;
        for (int i = 1; i < num; i++)
        {
            StringBuilder sb = new StringBuilder();
            if(i % 3 == 0) sb.append("Fizz");
            if(i % 5 == 0) sb.append("Buzz");

            if(Integer.toString(i).indexOf("3") != -1) sb.append("Bizz");
            if(Integer.toString(i).indexOf("5") != -1) sb.append("Fuzz");

            if (sb.length() == 0) System.out.print(i);
            else System.out.print(sb);
            System.out.println();
        }
    }
}

