import java.util.*;
//import java.io.*;



public class _2337__LR_movePieces {

    public boolean canChange(String start, String target) {
        int i=0,j=0;
        int n=start.length();
        if (!start.replace("_", "").equals(target.replace("_", ""))) {
            return false;
        }
          while(i<n || j<n)
          {
            while(start.charAt(i)=='_' && i<n)
            {
                i++;
            }
             while(target.charAt(j)=='_' && j<n)
            {
                j++;
            }
            if(i==n || j==n)
            {
                 return i==n && j==n;
            }
            if(start.charAt(i)!=target.charAt(j))
            {
                return false;
            }
            if(start.charAt(i)=='L' && i<j)
            {
                return false;
            }
            if(start.charAt(i)=='R' && i>j)
            {
                return false;
            }
            i++;
            j++;
          }
         
          return true;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}