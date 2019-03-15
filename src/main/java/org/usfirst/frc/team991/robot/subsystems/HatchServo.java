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
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class HatchServo extends Subsystem {

    // Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	Servo extender;

	public HatchServo()
		{extender = new Servo(9);}

	public void initDefaultCommand()
		{}
	
	
	public void stop()
		{}

	public void extendServo()
		{extender.set(0.99);}
	
	public void retractServo()
		{extender.set(0);}
}

