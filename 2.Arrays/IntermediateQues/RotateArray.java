import java.util.*;

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

// Example:
// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
public class RotateArray {

    //Time compleity O(k*n)
    public static void rotate(int arr[] , int  k){
        k = k % arr.length ;
        for ( int i =0 ; i< k ; i++){
            int lastElement = arr[arr.length -1];
            for(int j= arr.length - 1  ;  j  >= 1  ; j --){
                 arr[j] = arr[j-1];
            }
            arr[0] = lastElement ;
        }
    }
     //Time complexcity O(n)
    public static void reverse(int nums[] ,int start,int end){
        while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
        }
        }

    public static void display(int arr[]){
        for(int i =0 ; i< arr.length ; i ++) System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        // System.out.println(arr.length);
        rotate(arr, 3);
        display(arr);
        int k =0 ;
        int n = arr.length ;
         k %= n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        display(arr);

    }
}
