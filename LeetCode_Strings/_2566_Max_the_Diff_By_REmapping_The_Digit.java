public class _2566_Max_the_Diff_By_REmapping_The_Digit {
 public int minMaxDifference(int num) {
    
    String original = String.valueOf(num);

    int max = findMax(new StringBuilder(original), original.length());
    int min = findMin(new StringBuilder(original), original.length());
        
       
       return  max - min ;

    }

    private int findMax(StringBuilder s , int len)
    {
        int i=0;
        int toReMap= -1;
         while(i<len)
        {
            if(s.charAt(i) == '9')
            {
                i++;
            }
            else
            {
             toReMap = (int) s.charAt(i) ; 
             break;  
            }
        }

        if(toReMap != -1)
        {
           for ( i = 0; i < s.length(); i++) {
            if (s.charAt(i) == (char) toReMap) {
                s.setCharAt(i, '9');  
            }          
        }
        }
        return Integer.parseInt(s.toString());
    }

    
    private int findMin(StringBuilder s , int len)
    {
        char toReMap =  s.charAt(0);
        for(int i=0 ;i<len ;i++)
        {
            if(s.charAt(i) == toReMap)
            {
              s.setCharAt( i, '0');
            }
        }
        return Integer.parseInt( s.toString() );
    }

}
