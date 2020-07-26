class DigitalRoot {
    public int addDigits(int num) {
        
        //We are finding the digital root of a number in constant time
        
        if(num == 0)
            return 0;
        
        //If a number is divisble by 9 then sum of its digits will always be 9
        if(num % 9 == 0)
            return 9;
        
        //Eg dR(36)=9, but dR(37)=1, dR(38)=2 etc
        return num % 9;
    }
}
