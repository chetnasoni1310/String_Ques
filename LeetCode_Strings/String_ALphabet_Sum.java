import java.util.*;
//import java.io.*;


//  this is correctttttt                //niche wala incorrect
class Solution {
    public int getLucky(String s, int k) {
        // Step 1: Convert the string to a number string
        StringBuilder numberString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int pos = c - 'a' + 1; // Correct position calculation
            numberString.append(pos);
        }

        // Convert number string to initial sum of digits
        int sum = calculateDigitSum(numberString.toString());

        // Step 3: Repeat the digit sum calculation k times
        for (int i = 1; i < k; i++) {
            sum = calculateDigitSum(Integer.toString(sum));
        }

        return sum;
    }
 private int calculateDigitSum(String numStr) {
        int digitSum = 0;
        for (char c : numStr.toCharArray()) {
            digitSum += c - '0'; // Convert char to digit
        }
        return digitSum;
    }
}

//this is incorrect 
public class String_ALphabet_Sum {

    public static int getLucky(String s, int k) {
    long sum=0;
    StringBuilder numberString = new StringBuilder();
    for (int i = 0; i < s.length(); i++) 
         {       
                char c=s.charAt(i);
                int pos=c-96;
                numberString.append(pos);
         }
      long res=Long.parseLong(numberString.toString());
    while(k-->0){
    while (res != 0)
    {
        sum = sum + res % 10;
        res = res/10;
    }   
    res=sum;
    sum=0;
   }
        return (int)res;
    }
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    // String s=;
    String s=sc.next();
    int k=sc.nextInt();
    int ans=getLucky(s,k);
    System.out.println(ans);
}
sc.close();


}
}