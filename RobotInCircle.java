class RobotInCircle {
    public boolean isRobotBounded(String instructions) {
        
        //1)  if you end up where you started, it is a circle
        //2) if you end up in a different place with facing north (again), hence you are drifting away
        //3) All other scenarios are going to be in a circle (or come back) in infinity no matter.
        
        int[][] dir ={{0,1},{1,0},{0,-1},{-1,0}};
        
        //i is the direction that we are facing
        //Initially we start at origin with robot facing north ie i = 0
        int x = 0, y = 0, i = 0;
        
        for(int j = 0; j < instructions.length(); j++){
            
            char ch = instructions.charAt(j);
            
            //Robot will turn right, so next time G comes robot will move east
            if(ch == 'R'){
                i = (i + 1) % 4;
            }
            
            //Robot will turn left, so next time G comes robot will move west
            else if(ch == 'L'){
                i = (i + 3) % 4;
            }
            
            //Move by 1 to whichever direction the robot is currently facing
            else{ 
                x = x + dir[i][0];
                y = y + dir[i][1];
            }
            
        }
        
        //If the robot is facing north but is in the origin ie x=0 and y=0 then its circle
        //But if robot is facing north but not in origin, then it means robot is drifting away
        if(i == 0 & !(x == 0 && y == 0))
            return false;
        
        return true;
         
    }
}
