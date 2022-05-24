class Solution {
    public String reverseWords(String s) {
     String ar[]=s.split(" ");
        String a="";
        for(int i=ar.length-1;i>-1;i--)
        {
            a+=" "+ar[i]+" ";
        a=a.trim();
        }
        return a;
    }
}
