package org.usfirst.frc.team991.robot.commands;

import java.text.DecimalFormat;

import org.usfirst.frc.team991.robot.Robot;
import org.usfirst.frc.team991.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class lowerRobot extends Command 
{

    public lowerRobot()
        {requires(Robot.lifter);}

    protected void initialize()
        {}
    
    protected void execute()
        {Robot.lifter.moveBothLifters(-1);}
    
    protected boolean isFinished()
        {return false;}

    protected void end()
        {}
    
    protected void interrupted()
        {}

}
