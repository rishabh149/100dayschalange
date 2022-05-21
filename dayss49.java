logo

8. String to Integer (atoi)
Description
Hints
Submissions
Discuss
Solution
      
Java Solution Taking care of all edge cases
Java Solution Taking care of all edge cases
104
VIEWS
0
Created at: May 17, 2022 5:42 PM

meetsoni1214
meetsoni1214
 9
    public int myAtoi(String s) {
        int ans = 0;
        int i = 0;
        boolean check = false;
        boolean digcheck = false;
        while(i < s.length()) {
            if(s.charAt(i) == ' ') {
                if (digcheck) {
                    break;
                }
                i++;
                continue;
            }
              else if (s.charAt(i) == '+') {
                  if (digcheck) {
                    break;
                }
                  if (i + 1 < s.length() && !(Character.isDigit(s.charAt(i + 1)))) {
                      break;
                  }
                i++;
                continue;
            }else if (s.charAt(i) == '-') {
                  if (digcheck) {
                    break;
                }
                    if (i + 1 < s.length() && !(Character.isDigit(s.charAt(i + 1)))) {
                      break;
                  }
                check = true;
                i++;
                continue;
            }else if (Character.isDigit(s.charAt(i))) {
                  digcheck = true;
                if ((ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7))) {
                    if (check) {
                        ans = Integer.MIN_VALUE;
                    }else {
                        ans = Integer.MAX_VALUE;
                    }
                    
                    break;
                }
                ans = ans * 10 + s.charAt(i) - '0';
                i++;
            }else {
                break;
            }
        }
        if (ans == Integer.MIN_VALUE) {
            return ans;
        }
        return (check) ? ans * -1 : ans;
