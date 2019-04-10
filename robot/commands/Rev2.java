/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class Rev2 extends InstantCommand {
  /**
   * Add your docs here.
   */
  public Rev2() {
    super();
    // Use requires() here to declare subsystem dependencies
    requires(Robot.sol2);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    Robot.sol2.Rev();
  }

}
