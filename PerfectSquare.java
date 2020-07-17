class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        
        if(num < 2)
            return true;
        
        //For num > 2, the sq root of num is always less than num/2 and greater than 1
        int left = 2;
        int right = num/2;
        int pivot;
        long mul;
        
        while(left <= right){
            
            pivot = left + (right - left)/2;
            
            mul = (long)pivot * pivot;
            if(mul == num)
                return true;
            
            if(mul < num)
                left = pivot + 1;
            
            else{
                 right = pivot -1;   
            }
        }
        
        return false;
    }
}
