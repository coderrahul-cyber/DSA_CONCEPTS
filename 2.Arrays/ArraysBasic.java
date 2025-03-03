import java.util.*;

public class ArraysBasic {

    public static void insertion(int num[]) {
        System.out.println("Enter number element you wnat to insert");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        if (size > num.length) {
            System.out.println("Error the size is not valid");
            input.close();
            return;
        }
        for (int i = 0; i < size; i++) {
            int data = input.nextInt();
            num[i] = data;
        }
        input.close();
        System.out.println("Data had me set successFully");

    }

    public static void display(int num[]) {

        System.out.println("The values in are as follows ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

    }
    public static int findGreatest(int num[]) {
        int greatest = Integer.MIN_VALUE;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > greatest) {
                greatest = num[i];
            }
        }
        return greatest;
    }

    public static int reverse(int num[]) {
        int i = 0 , temp ;
        int last = num.length -1 ;
        while(i<last){
            temp = num[i];
            num[i] = num[last];
            num[last]= temp;
            i++;
            last--;
        }
        return 1 ;
    }


    public static void main(String args[]) {
        // Arrays creation
        // int arr[] = new int[20];
        // insertion(arr);
        int numberarr[] = { 12, 13, 14, 80, 90, 1, 30 };
        // or directly creation
        // int numarr[] = {1,2,3,4,5,6};
        // String names[] = {"Jhon", "Alice" , "jack"};
        display(numberarr);
        //updation
        // numberarr[2]=1000;

        int res = findGreatest(numberarr);
        System.out.println("The greatest number is " + res);
        System.out.println("Reverse Array :" );
        reverse(numberarr);
        display(numberarr);


    }
}
