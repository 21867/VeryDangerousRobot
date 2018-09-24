/**
   @Author:
      Date:	10-02-06
   Teacher:	Coglianese
       Lab: Ch6_4
      Misc: 
  */
import kareltherobot.*;
import java.awt.Color;

public class MainDriver6_4a implements Directions
{
    public static void main(String args[])  
	{
		VeryDangerousRobot alice= new VeryDangerousRobot(5, 5, North, 0);
		alice.moveIntoRobotHeaven();
	}
	
    static {
        World.reset(); 
        World.readWorld("Ch6_4a.kwld"); 
        //World.setBeeperColor(Color.magenta);
        //World.setStreetColor(Color.blue);
        //World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}