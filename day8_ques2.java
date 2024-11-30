import java.io.*;
import java.util.*;

public class day8_ques2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
            Arrays.sort(arr);
        int option1=arr[n-1]*arr[n-2]*arr[n-3];
        int option2= arr[0]*arr[1]*arr[n-1];
        System.out.println(Math.max(option1,option2));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}