package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.ParallelRaceGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.drivetrain.Drivetrain;


public class StandardAuto extends SequentialCommandGroup {
    Drivetrain drivetrain;

    public StandardAuto(Drivetrain drivetrain){

        addCommands(
            new ParallelRaceGroup(
                new DriveForward(drivetrain),
                new WaitCommand(2)
            ),

            new ParallelRaceGroup(
                new TurnSomeAngle(drivetrain),
                new WaitCommand(2)
            ),
            //hopefully 90 degrees

            new ParallelRaceGroup(
                new DriveForward(drivetrain),
                new WaitCommand(2)
            ),

            new ParallelRaceGroup(
                new TurnSomeAngle(drivetrain),
                new WaitCommand(2)
            ),
            //hopefully 90 degrees

            new ParallelRaceGroup(
                new DriveForward(drivetrain),
                new WaitCommand(2)
            ),

        );

        addRequirements(drivetrain);

    }

    /*  runs once the command has finished/been interrupted  */
    @Override
    public void end(boolean interrupted){
        
    }
}
