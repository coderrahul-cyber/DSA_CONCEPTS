public class simplePatterns {
    public static void main(String args[]){

        int n =5 ;
        System.out.println("Right angled");

        for (int i =1 ; i<=n ; i++){
            for (int  j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Inverted Right angled");
        for (int i = 1 ; i<=n ; i++){
            for(int j = n; j>=i ; j--){// or we can use for (j = i ; j <= (n-i+1) ; j++)
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("number-Pyramid");
        for ( int i =1 ; i <= n ; i++){
            for (int j =1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Character Pattern");
        char ch ='A';// WE can perform the incremnet in this 
        for (int i =1 ;  i<=n ; i++){

            for (int j =1 ; j <=i ; j++){
                System.err.print(ch);
                ch++;
            }
            System.err.println();
             
        }
    }
}
