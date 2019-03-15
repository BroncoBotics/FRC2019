package org.usfirst.frc.team991.robot.commands;

import java.text.DecimalFormat;

import org.usfirst.frc.team991.robot.Robot;
import org.usfirst.frc.team991.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class runLifter extends Command 
{
    private double fMoveValue;
    private double bMoveValue;

    public runLifter()
        {requires(Robot.lifter);}

    protected void initialize()
    {
        fMoveValue = 0.0;
        bMoveValue = 0.0;
    }
    
    protected void execute()
    {
        fMoveValue = Robot.oi.getGamepad1().getRawAxis(1);
        bMoveValue = Robot.oi.getGamepad1().getRawAxis(5);

        
        if(fMoveValue > RobotMap.minActivationPower)
            {Robot.lifter.moveFrontLifter(fMoveValue*fMoveValue);}
        else if(fMoveValue < RobotMap.minActivationPower)
            {Robot.lifter.moveFrontLifter(-fMoveValue*fMoveValue);}
        
        if(bMoveValue > RobotMap.minActivationPower)
            {Robot.lifter.moveBackLifter(bMoveValue*bMoveValue);}
        else if(bMoveValue < RobotMap.minActivationPower)
            {Robot.lifter.moveBackLifter(-bMoveValue*bMoveValue);}


    }
    
    protected boolean isFinished()
        {return false;}

    protected void end()
        {}
    
    protected void interrupted()
        {}

}
