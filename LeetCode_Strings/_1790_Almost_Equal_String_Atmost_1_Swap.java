import java.util.ArrayList;
import java.util.List;

public class _1790_Almost_Equal_String_Atmost_1_Swap {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int first = -1, second = -1, count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (first == -1) {
                    first = i;  // Store the first mismatch index
                } else if (second == -1) {
                    second = i; // Store the second mismatch index
                } else {
                    return false; // More than 2 mismatches → can't swap to fix
                }
            }
        }

        return count == 2 && 
               s1.charAt(first) == s2.charAt(second) && 
               s1.charAt(second) == s2.charAt(first);
    }
    public boolean areAlmostEqual_Map(String s1, String s2) {
  if(s1.equals(s2))
        {
            return true;
        }
        
        int n1=s1.length();
     List<Integer> Mismatched_Index=new ArrayList<>();
    for(int i=0;i<n1;i++)
    {
        if(s1.charAt(i)!=s2.charAt(i))
        {
              Mismatched_Index.add(i);
        }
    }
       if(Mismatched_Index.size()==0 ) 
       {
        return true;
       }
       if(Mismatched_Index.size()==2)
       { 
          int i=Mismatched_Index.get(0);
          int j=Mismatched_Index.get(1);

          if(s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i))
          {
            return true;
          }
          
       }
       return false;
    }
}
