import java.util.ArrayList;
import java.util.List;

public class _3085_Min_Deletions_TO_Make_String_K_Special {
public int minimumDeletions(String word, int k) {

        /**WRONG THINKING H -
        See I am thinking of doing something like 
        first of all create a freq array 
        store the freq of chr in it 'a'-'a'
        then for the freq list we can start comparing by comparing each freq diff to
         check if it is <= k or not 
         if not then decrement the lower freq one 


         RIGHT THINKING IS 
         Dekho jo freq list thi usko sort out krlo 
         fir ek ko base freq  - f maanlo ki itni rehni chhaiye 
         fir current freq ko check kro ki voh uski range mai h ya nahi 
         
         curr <= f+k  orr curr >= f- k                       ""Range""
         curr > f+k (Too high)  orr curr < f-k (Too low)    ""Not Range""
         
         toh fir usko remove kro 
         total removals count krte rho 
         aur global min ko update krte raho 

         return min 
           */
          
        int[] freq = new int[26];
        for(int i=0;i<word.length();i++)
        {
            freq[word.charAt(i) - 'a']++;
        }  



        List<Integer> list = new ArrayList<>();
        for(int i : freq)
        {
            if(i!=0)
            list.add(i);
        }
        
        
        int totalRemovals = Integer.MAX_VALUE;
        for(int i : list)
        {
            int baseFreq = i;
            int removal =0;
            for(int currFreq : list)
            {
                if (currFreq > baseFreq + k) {
                removal += currFreq - (baseFreq + k);  // delete extra characters
                } else if (currFreq < baseFreq ) {
                    removal += currFreq;  // delete all
                }
            }
            totalRemovals = Math.min(totalRemovals , removal);
        }

         return totalRemovals;
    }
}
