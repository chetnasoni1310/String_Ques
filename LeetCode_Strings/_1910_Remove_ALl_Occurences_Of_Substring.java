public class _1910_Remove_ALl_Occurences_Of_Substring {
    public String removeOccurrences_Using_Built_in_IndexOf(String s, String part) {
        
        StringBuffer sb=new StringBuffer(s);
           
           while(sb.indexOf(part) != -1)
           {
              int index= sb.indexOf(part);
              sb.delete(index , index+ part.length());
           }
  
           return sb.toString() ;
      }
  
       public static String removeOccurrences(String s, String part)
       {
          StringBuffer sb=new StringBuffer();
          
          for(int i=0;i<s.length();i++)
          {
              char ch= s.charAt(i);
              sb.append(ch);
  
             int sbL=sb.length();
             int partL=part.length();
              if(sbL>=partL && sb.substring(sbL-partL).equals(part))
              {
                  sb.delete(sbL-partL,sbL);
              }
          }
          return sb.toString();
       }
    public static void main(String[] args) {
        String s= "daabcbaabcbc" ;
        String part="abc";
        System.out.println(removeOccurrences(s, part));

    }
}
