import java.util.*;


class First_Occurence_In_String {
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
        {       int i=0;
                while(i!=haystack.length())
                {
                    int l=needle.length();
                   if( haystack.substring(i,i+l).equals(needle))
                   {
                    return i;
                   }
                   i++;
                }
                return -1;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args) {
        String haystack ="savdbutsad";
        String needle ="sad";
        System.out.println(strStr(haystack, needle));
        // System.out.println((haystack.contains(needle)));
        // System.out.println(( haystack.substring(7,10).equals(needle)));
    }
}