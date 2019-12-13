package org.frcteam2910.robot.subsystems;

import org.frcteam2910.common.robot.subsystems.Subsystem;

public class DrivetrainSubsystem extends Subsystem {
    private static DrivetrainSubsystem instance;

    public static DrivetrainSubsystem getInstance() {
        if (instance == null) {
            synchronized (DrivetrainSubsystem.class) {
                if (instance == null) {
                    instance = new DrivetrainSubsystem();
                }
            }
        }

        return instance;
    }

    @Override
    public void outputToSmartDashboard() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void zeroSensors() {

    }

    @Override
    protected void initDefaultCommand() {

    }
}
