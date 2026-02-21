package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {

    private final CANSparkMax frontLeft =
        new CANSparkMax(Constants.Drive.FRONT_LEFT, MotorType.kBrushless);

    private final CANSparkMax backLeft =
        new CANSparkMax(Constants.Drive.BACK_LEFT, MotorType.kBrushless);

    private final CANSparkMax frontRight =
        new CANSparkMax(Constants.Drive.FRONT_RIGHT, MotorType.kBrushless);

    private final CANSparkMax backRight =
        new CANSparkMax(Constants.Drive.BACK_RIGHT, MotorType.kBrushless);

    private final DifferentialDrive drive =
        new DifferentialDrive(frontLeft, frontRight);

    public DriveSubsystem() {
        backLeft.follow(frontLeft);
        backRight.follow(frontRight);

        frontRight.setInverted(true);
    }

    public void tankDrive(double left, double right) {
        drive.tankDrive(left, right);
    }

    public void stop() {
        drive.stopMotor();
    }
}
