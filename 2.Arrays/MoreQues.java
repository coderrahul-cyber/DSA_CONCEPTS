public class MoreQues {

    public static void pairs(int num[]){
        for(int i =0 ; i <num.length ; i++){
            for(int j = i +1 ; j<num.length ; j++){
                System.out.print("(" +num[i] + "," + num[j] + ")" +" ");
            }
            System.out.println();
        }
    }

    public static void SubArray(int num[]){
        for(int i =0 ; i<num.length ; i++){
            int start = i ;
            for(int j = i ; j<num.length ; j++){
                int end = j ;
                for(int  k = start ; k <=end ; k++){
                    System.out.print(num[k]);
                }
               System.out.println();
            }
            System.out.println();
        }

    }

    public static void MaxSubArray(int num[]){
      int currentSum =0  ;
      int MaxSum = Integer.MIN_VALUE;
      for(int i =0 ; i<num.length ; i++){
        int start = i ;
        for(int j = i ; j<num.length ; j++){
            int end = j ;
            currentSum = 0;
            for(int k = start ; k <=end ; k++){
                    currentSum += num[k];
                    if(currentSum > MaxSum){
                        MaxSum = currentSum;
                    }
            }
        }
      }
      System.out.println("Maximum subArray is :" + MaxSum);
    }

    //MaxSubarray using the prefix Array
    public static void prefixArray(int num[]){
        int currentSum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        // first we calcaulate the prefix array
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for(int i =1 ; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        // now finding the maximumSubarray
        for(int  i =0 ; i<num.length ; i++){
            int start = i ;
            for(int j = i ; j<num.length ; j++){
                int end =j ;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[i-1] ;
                if(maxSum < currentSum ){
                    maxSum = currentSum;
                }

            }
        }

        System.out.println("Maximum subArray is :" + maxSum);

         
    }

    public static void main(String args[]) {
     int arr1[] = { 10, 40, 80, 2, 89, 90, 10, 45, 78 };
     int arr2[] = { -1,2,5,1 };
     //printing the pairs 
     pairs(arr1);

     //printing the SubArrays a continuous Part of the array
     SubArray(arr1);

     //maxing subarray (Brute Force)
     MaxSubArray(arr2);
     //maxing subarray (prefixmethod)
     prefixArray(arr2);




     

    }
}