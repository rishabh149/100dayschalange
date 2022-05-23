class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        Arrays.sort(strs);
        outer :
        for(int i=0;i<strs[0].length();i++)
        {
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(strs[j].charAt(i)==c)
                    continue;
                else
                    break outer;
            }
            s+=c;
        }
        return s;
    }
}
