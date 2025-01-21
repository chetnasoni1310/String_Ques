import java.util.*;
//import java.io.*;



public class String_Rotation_Of_Each_Other {

    public static boolean areRotations1(String s1, String s2) {
        // Your code here
        if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }
        s1=s1+s1;
        return s1.lastIndexOf(s2)>=0;
    }

      
  //------>>>>>  This is my Naive Method
//   Correct and simple approach is above this
// total 4 approaches has been used by me
// Other approaches are below this and i have to say that this is not an easy ques
public static boolean areRotations3(String s1, String s2) {
    // Your code here
    if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
        return false;
    }
 
    String concatenated=s1+s1;

return concatenated.contains(s2); 
// --->>Time Limit Exceeded
}


public static boolean areRotations4(String s1, String s2) {
    if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
        return false;
    }
 
    String concatenated=s1+s1;

  for(int i=0;i<s1.length();i++)
  {
      if(concatenated.startsWith(s2,i))
      {
          return true;
      }
  }
    return false;

// --->>Time Limit Exceeded

}


 boolean areRotations2(String s1, String s2) {
        int i=0;
        int j=0;
     
         if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }
        if(s1.equals(s2))
        {
            return true;
        }
        while(j!=s2.length())
        {   
            if(i==s1.length())
            {   
             
                i=0;
            }
            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                i++;
                j=0;
            
            }
            if (j == s2.length()) {
                return true; // Found a match, s2 is a rotation of s1
            }
        }
      return false;
 }
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your Strings: ");
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    System.out.println(areRotations1(s1,s2));
    sc.close();
      
    }
}
