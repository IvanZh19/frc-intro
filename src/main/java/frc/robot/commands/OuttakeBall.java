package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.Intake;

public class OuttakeBall extends CommandBase{

    private Intake intake;
    private double intakePower;

    public OuttakeBall(Intake intake, double intakePower){
        this.intake = intake;
        this.intakePower = intakePower;
        addRequirements(intake);
    }

    @Override
    public void execute(){
        if (intakePower>0) {
            intake.setPower(-intakePower);
        }
        
        else {
            intake.setPower(intakePower);

        }

        //intake positive, outtake negative?
    }

}