package org.frcteam2910.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.frcteam2910.common.robot.subsystems.SubsystemManager;
import org.frcteam2910.robot.subsystems.DrivetrainSubsystem;

public class Robot extends TimedRobot {
    private SubsystemManager manager = new SubsystemManager(
            DrivetrainSubsystem.getInstance()
    );

    @Override
    public void robotInit() {
        manager.enableKinematicLoop(5.0e-3);
    }

    @Override
    public void robotPeriodic() {
        Scheduler.getInstance().run();
    }
}
