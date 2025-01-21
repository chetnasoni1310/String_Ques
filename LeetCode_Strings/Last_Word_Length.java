import java.util.*;

public class Last_Word_Length {

    public static int lengthOfLastWord(String s) {
        String[]words=s.split(" ");
        return words[words.length-1].length();
     }

   public static void main(String[] args)
   {
        // Scanner sc=new Scanner(System.in);
        String s = "Hello World3456 asd";
        System.out.println(lengthOfLastWord(s));
   }

}