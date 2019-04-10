/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.For1;
import frc.robot.commands.For2;
import frc.robot.commands.For3;
//import frc.robot.commands.Off1;
import frc.robot.commands.Reset;
//import frc.robot.commands.Rev1;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public Joystick stick = new Joystick(RobotMap.controller);

  Button fire1 = new JoystickButton(stick, RobotMap.button_X);
  Button fire2 = new JoystickButton(stick, RobotMap.button_A);
  Button fire3 = new JoystickButton(stick, RobotMap.button_B);
  
  Button off1 = new JoystickButton(stick, RobotMap.button_Back);

  Button tog = new JoystickButton(stick, RobotMap.button_Start);

  public OI() {

    fire1.whenPressed(new For1());
    fire2.whenPressed(new For2());
    fire3.whenPressed(new For3());
    off1.whenPressed(new Reset());

    /*claw_In.whileHeld(new ());
    claw_Out.whileHeld(new Claw_Out());

    lift_Up.whileHeld(new Lift_Up());
    lift_Down.whileHeld(new Lift_Down());*/

    tog.toggleWhenPressed(new ArcadeDrive());

  }
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
