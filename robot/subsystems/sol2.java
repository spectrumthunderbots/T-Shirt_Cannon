/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.Off1;

/**
 * Add your docs here.
 */
public class sol2 extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  DoubleSolenoid piston = null;

  public sol2() {
    piston = new DoubleSolenoid(2, 3);
  }

  public void For() {
    piston.set(Value.kReverse);
  }

  public void Rev() {
    piston.set(Value.kForward);
  }

  public void Off() {
    piston.set(Value.kOff);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new Off1());
  }
}
