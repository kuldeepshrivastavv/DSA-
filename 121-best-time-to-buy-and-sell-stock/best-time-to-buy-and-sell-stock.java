class Solution {
    public int maxProfit(int[] arr) {
        int max = 0 ;
        int min = Integer.MAX_VALUE;
        if(arr.length < 2 ){
            return 0 ;
        }
        
            for( int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min ){
               min = arr[i] ;
            }
            if(arr[i] - min > max ){
                max= arr[i] - min ;
            }
            
        
       
    }
     return max ;
}
}