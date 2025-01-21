import java.util.*;
//import java.io.*;



public class LongestSubString {

    public static int longestCommonSubstr(String str1, String str2) {
          int n1=str1.length();
          int n2=str2.length();
          int count=0;
          int res=0;
          for (int i=1; i<=n1; i++) {
            for(int j=1; j<=n2; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1))
               {
                count++;
                if(res<count){
                    res=count;
                  }
               }
              
            }
          }
        return res;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
System.out.println(longestCommonSubstr(s1,s2));

sc.close();


}
}