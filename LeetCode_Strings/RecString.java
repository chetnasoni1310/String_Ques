import java.util.*;
//import java.io.*;



public class RecString {

static void recString(String s_processed,String given){
    if(given.length()==0)
    {
        System.out.println(s_processed);
        return;
    }
      char ch=given.charAt(0);
    if(ch=='a')
    {
        recString(s_processed,given.substring(1));
    }
    else{
        recString(s_processed+ch,given.substring(1));
    }
}


static String rec(String s) {
    {
       if(s.length()==0)
       {
        return "";
       }
       char ch=s.charAt(0);
       if(ch=='a')
       {
        return rec(s.substring(1));
       }
       return ch+rec(s.substring(1));
    }
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
String s=sc.nextLine();
StringBuilder ss=new StringBuilder();
for(int i=0;i<s.length();i++)
{
    if(s.charAt(i)!='a')
    {
         ss.append(s.charAt(i));
    }
}
System.out.println(ss);
System.out.println(s);
recString("", "amijetomarrrsunnioaa");
System.out.println(rec("assskjfhfjkfhaa"));
sc.close();


}
}