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
        for (int i =1 ; i<=n ;i++){
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
       
        
    }
}
