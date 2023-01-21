//{ Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   // add your code here
	  /* if(N==1) return 1;
      
      Arrays.sort(arr);
      int ans = 1;
      int count = 1;
      for(int i = 1; i<N; i++){
          if(arr[i]-arr[i-1]==1){
              count++;
              ans = Math.max(ans,count);
          }
          else if(arr[i]==arr[i-1]) continue;
          else count = 1;
      }
      
      return ans;
      */
      
      /* Set<Integer> uniqueElements = new HashSet<>();
	    for (int val : arr) {
	        uniqueElements.add(val);
	    }
	    int maxSubSeq = 0;
	    int currentMax;
	    for (int i = 0; i < N; i++) {
	        int currentVal = arr[i];
	        
	        currentMax = 0;
	        if (!uniqueElements.contains(currentVal - 1)) {
	            while (uniqueElements.contains(currentVal)) {
	                currentVal++;
	                currentMax++;
	            }
	            
	            maxSubSeq = Math.max(maxSubSeq, currentMax);
	        }
	    }
	    return maxSubSeq; */
	    
	    
	    
	    HashSet<Integer> set=new HashSet<>();
	   
	    for(int i=0;i<n;i++)
	    {
	        set.add(arr[i]);
	    }
	    int res=0;
	    for(int i=0;i<n;i++)
	    {
	        if(!set.contains(arr[i]-1))
	        {
	            int val=arr[i]+1;
	            while(set.contains(val))
	            {
	                val++;
	                
	            }
	            res=Math.max(res,val-arr[i]);
	        }
	    }
	    return res;
	}
}