import java.util.Arrays;

public class Minimum_Sum{
      String minSum(int[] arr) {
        // code here
        
        /*My observations :
        1. Sort the array 
        2. Start forming the numbers by adding the ith one in the num1 and num2 
           alternatively
        3. when the array reaches its end sum the numbers and return without 
           leading zeroes 
        */
        
        Arrays.sort(arr);
        
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        
        int i=0;
        int j=1;
        int n=arr.length;
        
        while(i<n || j<n)
        {  
            if(i<n)
            num1.append( (char) (arr[i] + '0') );
            
            if(j<n)
            num2.append( (char) (arr[j] + '0') );
            
            i+=2;
            j+=2;
        }
        
        // Long n1 = Long.parseLong( num1.toString() );
        // Long n2 = Long.parseLong( num2.toString() );
        
        // Long result = n1+n2;
        
        // return Long.toString(result);
        
        String result = addStrings(num1.toString(), num2.toString());
          return result.replaceFirst("^0+(?!$)", ""); // remove leading zeros;
    }
    
    private String addStrings(String num1, String num2) {
    StringBuilder result = new StringBuilder();
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    int carry = 0;

    while (i >= 0 || j >= 0 || carry > 0) {
        int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
        int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

        int sum = digit1 + digit2 + carry;
        result.append(sum % 10);
        carry = sum / 10;

        i--;
        j--;
    }

    return result.reverse().toString();
}
}