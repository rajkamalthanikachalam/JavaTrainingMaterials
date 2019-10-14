package InterviewQuestions;


	import java.util.*;

	public class Solution {

	  private static int getMinStepsToGetK(long k,PriorityQueue<Integer> newQueue){
	    int count=0;
	    while(newQueue.peek()<k) {
	      if(newQueue.size()>=2) {
	        count++;
	        int tempFirst = newQueue.poll();
	        int tempSecond = newQueue.poll();
	        newQueue.offer(tempFirst+(tempSecond*2));
	      }
	      else {
	        return -1;
	      }
	    }
	    return count;
	  }

	  public static void main(String[] args) {
	    Scanner scanObj = new Scanner(System.in);
	    int numOfCookies = scanObj.nextInt();
	    long minSweetness = scanObj.nextLong();
	    PriorityQueue<Integer> newQueue = new PriorityQueue<Integer>();
	    for(int i=0;i<numOfCookies;i++) {
	      newQueue.offer(scanObj.nextInt());
	    }
	    System.out.println(getMinStepsToGetK(minSweetness,newQueue));
	  }

	}
