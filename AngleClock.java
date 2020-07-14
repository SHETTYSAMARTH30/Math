class AngleClock {
    public double angleClock(int hour, int minutes) {
        
        int oneMinAngle = 6; //360 degrees/60 = 6
        int oneHourAngle = 30; //360 deg / 12 = 30
        
        //Gives the angle between vertical line at 12 and Min hand
        double minHand = minutes * oneMinAngle;
        
        //Gives the angle between vertical line and hour hand
        //Since hour hand changes as minutes increase we add minutes/60
        //Eg for 4:30 , the hour hand is not on 4 but between 4 and 5
        
        double hourHand = (hour % 12 + minutes / 60.0) * oneHourAngle;
        
        //Finding the angle between minHand and hourHand
        double diff = Math.abs(hourHand - minHand);
        
        //We need to return the smallest angle between them ie acute angle
        
        return Math.min(diff, 360-diff);

    }
}
