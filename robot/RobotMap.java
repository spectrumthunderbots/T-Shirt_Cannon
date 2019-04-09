/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {


    //Controller stuff
    public static int controller = 0;
    public static int joy_left_y = 1;
    public static int joy_right_x = 4;
    public static int button_A = 1;
    public static int button_B = 2;
    public static int button_X = 3;
    public static int button_Y = 4;
    public static int button_LeftBumper = 5;
    public static int button_RightBumper = 6;
    public static int button_Back = 7;
    public static int button_Start = 8;
  
    //Drivetrain 
    public static int m_leftFront = 0;
    public static int m_leftBack = 1;
    public static int m_rightFront = 2;
    public static int m_rightBack = 3;
  
    //Pneumatics
    public static int sol_up = 0;
    public static int sol_down = 1;
  
    //Lift and claw
    public static int m_lift = 4;
    public static int m_claw = 5;
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
