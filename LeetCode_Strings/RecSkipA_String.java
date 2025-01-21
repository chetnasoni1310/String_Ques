import java.util.*;
//import java.io.*;



public class RecSkipA_String {
    static String skipAppFromNotApple(String res,String s) {
        if(s.length()==0)
        {
            return res;
        }
        if(  s.startsWith("app") && ! s.startsWith("apple"))
        {
            return skipApple(res, s.substring(3));
        }
        else{
            return skipApple(res+s.charAt(0), s.substring(1));
        }
    }


    static String skipApple(String res,String s) {
        if(s.length()==0)
        {
            return res;
        }
        if(   s.startsWith("Apple"))
        {
            return skipApple(res, s.substring(5));
        }
        else{
            return skipApple(res+s.charAt(0), s.substring(1));
        }
    }





static String skipChar_a(String res,String s) {
    if(s.length()==0)
    {
        return res;
    }
    char ch=s.charAt(0);
    if(ch=='a')
    {
        return skipChar_a(res, s.substring(1));
    }
    else{
       return skipChar_a(res+ch, s.substring(1));
    }
    
}

public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
String s=(skipChar_a("", "nasdfghjull"));
// System.out.println(s);
System.out.println(skipApple("", "appappApplehatgya"));
System.out.println(skipAppFromNotApple("", "appappAppleappleshatgya"));

sc.close();


}
}