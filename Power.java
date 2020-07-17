class Power {
    public double myPow(double x, int n) {
        
        //x ^ 2n = (x^n * x^n) if 2n is even
        //If n is odd the x^n * x^n * x = x ^ 2n+1
        
        long N = n;
        
        if(N < 0){
            N = -N;
            x = 1/x;
        }
        
        return findPow(x,N);
        
    }
    
    public double findPow(double x, long n){
        
        if(n == 0)
            return 1.0;
        
        double half = findPow(x,n/2);
        
        //If n is even
        if(n % 2 == 0){
            //when n is even. x^2n = x^n * x^n
            return half * half;
        }
        else{
            //when n is odd. Eg x^5 = (x^2 * x^2) * x
            return half * half * x;
        }
        
    }
}
