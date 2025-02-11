public class intermediatePatterns {

    public static void main (String args[]){
        int n =5;
        System.out.println("Hollow-Rectangle");
        for(int i =1 ; i<n ; i++){
            for (int j =1 ; j<=n ;j++){
                if (i == 1 || i == n-1 || j == 1 || j == n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("Rhombus Star patterns");
        for(int i =1 ; i <n ; i++){
            for(int j =0 ; j <i ; j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=n ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Mirrored Rhombus Patterns");
        for (int i =1 ; i<n ;i++){
            for (int j = n ; j>=i ; j--){
                System.out.print(" ");
            }
            for (int j =1 ; j<=n ; j++){
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("Pyramid Star pattern");
       
        for (int i =0 ; i<n ; i++){
            //whiteSpaces
            for (int j = n ; j>i ; j--){
                System.out.print(" "); 
            }
            for(int j = 0 ; j<=i*2 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Reversed Pyramid Pattern");
        for(int i =0 ; i<n ; i++){
         for(int j = 0 ; j<i;j++){
            System.out.print(" ");
         }
         for(int j=0;j< 2*n -(2*i +1);j++){
            
            System.out.print("*");
        }

         System.out.println();
        }

        System.out.println("Mirrored Half Pyramid");
        for(int i = 0 ; i <n ; i++){
            for(int j = n ; j >i ;j--){
                System.out.print(" ");
            }
            for(int j =0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Inverted Half-Pyramid with number");
        // for(int i =n ; i > 0 ; i--){
        //     for(int j=1 ; j<=i  ;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //OR ANOTHER
        for(int i =1 ; i<=n ; i++){
            for(int j =1 ; j <= n-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("Floyd's Triangle");
        int x =1 ;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<=i ; j++){
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }

        System.out.println("0 and 1 triangle");
        for(int i =0 ; i< n ;i++){
            for(int j =0 ; j <=i ; j++){
                if((j+i) % 2 == 0 ){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println("ButterFly Pattern");
        for(int  i=1 ; i<= n ; i++){
            for(int j = 1 ; j<= i ;j++){
                System.out.print("*");
            }
            for(int k =1 ; k<= 2*(n-i) ; k++){
                System.out.print(" ");
            }
             for(int l =1 ; l<=i ;l++){
                    System.out.print("*");
                }
            System.out.println();
        }
        for(int i=n ; i>0 ;i-- ){
            for(int j = 1 ; j<= i ;j++){
                System.out.print("*");
            }
            for(int k =1 ; k<= 2*(n-i) ; k++){
                System.out.print(" ");
            }
             for(int l =1 ; l<=i ;l++){
                    System.out.print("*");
                }
            System.out.println();
        }

        System.out.println("Hollow Rhombus");
        for(int  i =0  ;i< n ; i++){
            for(int s = n ; s>i+1 ; s--){
                System.out.print(" ");

            }
            for(int j = 0 ; j< n ; j++){
                 if(i==0 || i == n -1 || j == 0 || j == n -1){
                    System.out.print("*");
                 }else{
                    System.out.print(" ");
                 }
            }
            System.out.println();
        }

        System.out.println("Diamond Pattern");
        //Upperhalf
        for(int i =1  ; i<=n ; i++){
            for(int j = n ; j > i ; j--){
                System.out.print(" ");
            }
            for(int j =1  ; j <= 2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //LowerHalf
        for(int i = n ; i>=1 ; i--){
            for(int j = n ; j > i ; j--){
                System.out.print(" ");
            }
            for(int j =1  ; j <= 2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

       
        
    }
}
