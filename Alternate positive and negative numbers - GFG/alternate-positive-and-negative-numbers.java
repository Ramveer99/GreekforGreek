//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> negetive, positive;

       negetive = new ArrayList<>();

       positive = new ArrayList<>();

       

       for(int i = 0; i < n; i++){

           if(arr[i] < 0)     negetive.add(arr[i]);

           else              positive.add(arr[i]);

       }
       
       
       
       

       int i = 0, j =0;

       int ind = 0;

       while(i < positive.size() && j < negetive.size()){

           arr[ind] = positive.get(i++);

           arr[ind+1] = negetive.get(j++);

           ind += 2;

       }
       
       
       

       while( i < positive.size()){

           arr[ind++] = positive.get(i++);

       }

       while( j < negetive.size()){

           arr[ind++] = negetive.get(j++);

       }

    

    }
}