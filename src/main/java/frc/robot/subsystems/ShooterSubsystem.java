package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {

    private final CANSparkMax master =
        new CANSparkMax(Constants.Shooter.MASTER_ID, MotorType.kBrushless);

    private final CANSparkMax follower =
        new CANSparkMax(Constants.Shooter.FOLLOWER_ID, MotorType.kBrushless);

    public ShooterSubsystem() {
        follower.follow(master, true); // true = invert follower if needed
    }

    public void shoot() {
        master.set(Constants.Shooter.SPEED);
    }

    public void stop() {
        master.stopMotor();
    }
}
