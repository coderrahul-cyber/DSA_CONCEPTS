import java.util.*;
public class BasicAlgo {

    //linarSearch Arrays
    public static void linarSearch(int num[], int key){
        for(int i =0 ; i<num.length ; i++){
            if(key == num[i]){
                System.out.println("The Number " + key  + " Found at " +  (i+1) + " position ");
                return;
            }
        }
        System.out.println("Number does not Found");
    }

    //binary search
    public static void binarySearch(int num[] , int key){
      int lowerbound = 0 ;
      int upperbound = num.length -1 ;
      int mid = (lowerbound + upperbound) /2 ;
      while (lowerbound <= upperbound){
        if(num[mid] == key){
            System.out.println("Number " + key + " found " + (mid + 1) + " position"  );
            return;
        }
        else if(num[mid] > key){
            upperbound = mid -1;
        }
        else{
            lowerbound = mid +1 ;
        }
      }
      System.out.println("Number is not found");
    }
    public static void main(String args[]){
        
        int arr1[] = {10,40,80,2,89,90,10,45,78};
        int arr2[]={10,20,30,50,110,200,300,400,500};
        int key ;
        int key2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you have to find  :");
        key = sc.nextInt();
        System.out.println("Enter the number you have to find through binary :");
        key2 = sc.nextInt();
        sc.close();
        linarSearch(arr1 , key);
        //For binary search the array must sorted
        binarySearch(arr2, key2);



    }
}
