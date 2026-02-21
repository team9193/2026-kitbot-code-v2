package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FeederSubsystem;

public class FeederCommand extends Command {

    private final FeederSubsystem feeder;

    public FeederCommand(FeederSubsystem feeder) {
        this.feeder = feeder;
        addRequirements(feeder);
    }

    @Override
    public void execute() {
        feeder.run();
    }

    @Override
    public void end(boolean interrupted) {
        feeder.stop();
    }
}
