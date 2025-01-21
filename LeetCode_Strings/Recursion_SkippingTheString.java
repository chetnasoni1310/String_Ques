import java.util.*;
//import java.io.*;



public class Recursion_SkippingTheString {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
SkippAppNotApple("", "nuappapplell");


sc.close();


}
static void SkippAppNotApple(String p,String up)
{
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch=up.charAt(0);
    if(up.startsWith("app") && !(up.startsWith("apple")))
    {
          SkippAppNotApple(p, up.substring(3));
    }
    else
    {
       SkippAppNotApple(p+ch, up.substring(1));
    }
}
}