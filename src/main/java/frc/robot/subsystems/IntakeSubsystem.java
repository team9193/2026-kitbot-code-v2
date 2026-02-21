package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {

    private final CANSparkMax motor =
        new CANSparkMax(Constants.Intake.MOTOR_ID, MotorType.kBrushless);

    public void run() {
        motor.set(Constants.Intake.SPEED);
    }

    public void reverse() {
        motor.set(-Constants.Intake.SPEED);
    }

    public void stop() {
        motor.stopMotor();
    }
}
