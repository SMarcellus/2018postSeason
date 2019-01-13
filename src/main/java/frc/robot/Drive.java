
package frc.robot;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class Drive
{
  private WPI_TalonSRX leftFrontTalon;
  private WPI_TalonSRX rightFrontTalon;
  private WPI_TalonSRX leftRearTalon;
  private WPI_TalonSRX rightRearTalon;
  private MecanumDrive wpiDrive;

  // Constructor
	public Drive()
	{
        leftFrontTalon = new WPI_TalonSRX(1);
        rightFrontTalon = new WPI_TalonSRX(2);
        leftRearTalon = new WPI_TalonSRX(3);
        rightRearTalon = new WPI_TalonSRX(4);
        wpiDrive = new MecanumDrive(leftFrontTalon, rightFrontTalon, leftRearTalon, rightRearTalon);
        wpiDrive.setDeadband(0.01);
    }

    public void teleopPeriodic() {
       wpiDrive.driveCartesian(0.5 /*ySpeed*/, 0.5 /*xSpeed*/, 0.5 /*zRotation*/);
    }
}