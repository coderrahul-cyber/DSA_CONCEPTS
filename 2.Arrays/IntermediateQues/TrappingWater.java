public class TrappingWater {
    
    public static int trappedWater(int num[]){

        //calcul ate left max boundary - array
        int leftMax[] = new int[num.length];
        leftMax[0] = num[0];
        for(int i =1 ; i<num.length ; i++){
            leftMax[i] = Math.max(num[i], leftMax[i-1]);
        }

        //calculate right max boundary - array
        int rightMax[] = new int[num.length];
        rightMax[num.length -1 ] = num[num.length -1] ;
        for(int i = num.length -2 ; i>= 0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1] , num[i]);
        }

        //trap water logic
        int trapWater = 0 ;
        for(int i = 0 ; i<num.length ; i++){
            //min of boundary
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //calcuate the waterlevel in particular hight ( w - h ) * w
             trapWater += waterLevel - num[i];
        }

        return trapWater;
    }
    public static void main(String agr[]){
        //non-negative array
        int height[] = {4,2,0,3,5,2};
        System.out.println(trappedWater(height));

    }
}
