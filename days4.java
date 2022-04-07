// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

public class GfG { 
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    int[] arr = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++)arr[i] = Integer.parseInt(inputLine[i]);
		    
		    Solution obj = new Solution();
		    System.out.println(obj.firstElementKTime(arr, n, m));
		}
	}
}
// } Driver Code Ends


class Solution
{
    public int firstElementKTime(int[] arr, int n, int k) { 
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(s.containsKey(arr[i])) {
                s.put(arr[i], s.get(arr[i]) + 1); 
            } else {
                s.put(arr[i], 1);
            } 
            if(s.get(arr[i])==k){
                return arr[i];
            } 
        }
        
        return -1;
    } 
}
