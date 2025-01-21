import java.util.*;
//import java.io.*;



public class Heap_Priority_LexicographycialOrder_2182 {
 public String repeatLimitedString(String s, int repeatLimit) {
        //Counting Freq
        int []freq=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }

        
        //using priority queue
        PriorityQueue<Character> maxHeap=new PriorityQueue<>((a,b)->b-a);
        
        //filling it
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)
            {
                maxHeap.offer((char)(i+'a'));
            }
        }


        //making string and filling it
        StringBuilder result=new StringBuilder();
        while(!maxHeap.isEmpty())
        {
            char ch=maxHeap.poll();
            int count=Math.min(repeatLimit,freq[ch-'a']);
            

            //jitni count ki value h utni fill krdo
            for(int j=0;j<count;j++)
            {
                result.append(ch);
            }
            
            //usko decrease krdo
            freq[ch-'a']-=count;

            //fir bhi freq bachi ho toh breaker laga ke add krdo
            if(freq[ch-'a']>0)
            {
                if(maxHeap.isEmpty())
                {
                    break;
                    //as kuch breaker nhi bacha
                }
                else
                {  
                    char breaker=maxHeap.poll();
                   result.append(breaker);
                   freq[breaker-'a']--;

                   if(freq[breaker-'a']>0)
                   {
                    maxHeap.offer(breaker);
                    //yeh isliye kia kyunki agar yeh bacha hua hai toh priority queue mai daldo baad mai poll krke dobara nikaal lenge 
                   }

                   maxHeap.offer(ch);

                }
            }


        }
        return result.toString();
    }

public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}