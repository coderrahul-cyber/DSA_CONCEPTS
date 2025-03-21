package Arrays;

import java.util.Scanner;

public class rotate_array_in_place {

    public static void reverse(int[] arr,int i,int j){

        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print(" n :");
        int n=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(" k :");
        int k=sc.nextInt();

        k = k%n;

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }

    }
}
