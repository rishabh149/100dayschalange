class Solution {
    public boolean isPalindrome(String s) {
          int left = 0;
        int right = s.length() - 1;
        
        while(left < right)
        {
            //get valid 
            char c; 
            while(!Character.isLetterOrDigit(c = s.charAt(left)))
            {
                left++;
                if (left > right)
                    return true;
            }
            
            char d; 
            while(!Character.isLetterOrDigit(d = s.charAt(right)))
            {
                right--;
                if (left > right)
                    return true;
            }
            
            if('A'<= c && c<= 'Z'){
                c = (char)(c - 'A' + 'a');
            }
            
            if('A'<=d && d<= 'Z'){
                d = (char)(d - 'A' + 'a');
            }
            
            if(c != d)
            {
                return false;
            }
            else
            {
                left++;
                right--;                  
            }          
        }
        return true; 

    }
}
