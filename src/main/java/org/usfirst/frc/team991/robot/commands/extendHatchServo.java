package org.usfirst.frc.team991.robot.commands;

import java.text.DecimalFormat;

import org.usfirst.frc.team991.robot.Robot;
import org.usfirst.frc.team991.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class extendHatchServo extends Command 
{

    public extendHatchServo()
        {requires(Robot.hatchServo);}

    protected void initialize()
        {}
    
    protected void execute()
        {Robot.hatchServo.extendServo();}
    
    protected boolean isFinished()
        {return true;}

    protected void end()
        {}
    
    protected void interrupted()
        {}

}
