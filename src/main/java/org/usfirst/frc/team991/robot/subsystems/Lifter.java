package org.usfirst.frc.team991.robot.subsystems;

import java.text.DecimalFormat;

import org.usfirst.frc.team991.robot.Robot;
import org.usfirst.frc.team991.robot.RobotMap;
import org.usfirst.frc.team991.robot.commands.arcadeDriveWithJoystick;
import org.usfirst.frc.team991.robot.commands.runLifter;

import com.ctre.phoenix.motorcontrol.ControlMode;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.analog.adis16448.frc.ADIS16448_IMU;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Lifter extends Subsystem {

    // Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	TalonSRX frontLifter;
	TalonSRX backLifter;
	TalonSRX backAxle;

	public Lifter()
	{
		frontLifter = new TalonSRX(RobotMap.frontLifter);
		backLifter = new TalonSRX(RobotMap.backLifter);
		backAxle = new TalonSRX(RobotMap.backAxle);
	}
	
	public void initDefaultCommand()
		{setDefaultCommand(new runLifter());}
	
	public void moveFrontLifter(double power)
	{
		if(Math.abs(power) > 0.05)
			{frontLifter.set(ControlMode.PercentOutput, -power);}
		else
			{frontLifter.set(ControlMode.PercentOutput, 0.0);}
	}

	public void moveBackLifter(double power)
	{
		if(Math.abs(power) > RobotMap.minActivationPower)
			{backLifter.set(ControlMode.PercentOutput, -power);}
		else
			{backLifter.set(ControlMode.PercentOutput, 0.0);}
	}

	public void moveBothLifters(double power)
	{
		moveFrontLifter(power);
		moveBackLifter(power);
	} 

	public void moveBackAxle(double power)
	{
		if(Math.abs(power) > RobotMap.minActivationPower)
			{backAxle.set(ControlMode.PercentOutput, -power);}
		else
			{backAxle.set(ControlMode.PercentOutput, 0.0);}
	}

	public void stop()
	{
		frontLifter.set(ControlMode.PercentOutput, 0.0);
		backLifter.set(ControlMode.PercentOutput, 0.0);
		backAxle.set(ControlMode.PercentOutput, 0.0);
	}


}

