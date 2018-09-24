    import kareltherobot.*; 
/**
 * @author : 
 * teacher : Coglianese
 * due date:
 */
public class VeryDangerousRobot extends Robot//extends ???
{
    
    public VeryDangerousRobot (int st, int ave, Direction direction, int beeps)
        {
            super(st, ave, direction, beeps);
        }
        /**
     * Constructor for objects of class VeryDangerousRobot
     */


    /**
     * An required method - replace this comment with your own
     * You are not allowed to count the number of beepers
     * Any code that involves counting will receive no credit!!!
     */
    public void turnAround()
    {
        turnLeft();
        turnLeft();
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveIntoRobotHeaven()
    {
        turnRight();
        while (nextToABeeper())
        {
            pickBeeper();
            turnAround();
            
        // put your code here
      }
      while(anyBeepersInBeeperBag())
      {
          putBeeper();
        }
      move();
      while(nextToABeeper())
      {
          pickBeeper();
        }
      turnAround();
      move();
      if (facingWest())
      {
          turnRight();
     
     }
     else
     {
         turnLeft();
        }
}
}
