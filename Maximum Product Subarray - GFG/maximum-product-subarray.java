//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
         /*long bestPro=arr[0];
        long curPro=1;
        for(int i=0;i<arr.length;i++)
        {
            curPro=Math.max(arr[i],curPro*arr[i]);
            bestPro=Math.max(bestPro,curPro);
            if(curPro==0)
            {
                curPro=1;
            }
        }
        
        return bestPro;
        */
        
        long res = arr[0];
        long curres = 1;
        for(int i = 0 ; i < n ; i ++){
           curres*=arr[i];
           res=Math.max(res,curres);
           if(curres==0){
               curres=1;
            }
            }
            curres = 1;
           for(int i = n-1 ; i >=0  ; i --){
           curres*=arr[i];
           res=Math.max(res,curres);
           if(curres==0){
               curres=1;
            }
            }
           
        
        return res;
    }
}