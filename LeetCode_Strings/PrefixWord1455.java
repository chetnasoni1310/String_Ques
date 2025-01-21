import java.util.*;
//import java.io.*;



public class PrefixWord1455 {

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr=sentence.split(" ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i].startsWith(searchWord))
            {
                return i+1;
            }
        }
        return -1;

    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
String sentence="i love to eat burger";
// System.out.println(sentence.split(" "));
System.out.println(isPrefixOfWord(sentence, "p"));

sc.close();


}
}