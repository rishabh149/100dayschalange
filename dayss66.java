//Back-end complete function Template for Java

class Solution
{
    //Function to find root of a node.
    private int findRoot(int i, int par[])
    {
        //iterating to find the node whose par[i] is equal to i.
        while(i != par[i])
            i = par[i];
        return i;
    }

    //Function to merge two nodes a and b.
    public void union_(int a, int b, int par[], int rank[])
    {
        //find root of nodes a and b.
        int x = findRoot(a, par);
        int y = findRoot(b, par);
    
        //base case if they are already in same set.
        if(x == y)
            return;
        
        //checking for rank and putting in set with higher rank.
        if(rank[x] >= rank[y]){
            rank[x]++;
            par[y] = par[x];
        }else{
            rank[y]++;
            par[x] = par[y];
        }
        return;
    }
    
    //Function to check whether 2 nodes are connected or not.
    public Boolean isConnected(int a, int b, int par[], int rank[])
    {
        //if root of both nodes is same then they are connected.
        return (findRoot(a, par) == findRoot(b, par));
    }

}
