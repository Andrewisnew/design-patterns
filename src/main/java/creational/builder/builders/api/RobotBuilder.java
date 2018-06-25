package creational.builder.builders.api;

import creational.builder.entities.Hand;
import creational.builder.entities.Leg;
import creational.builder.entities.MegaRobot;
import creational.builder.entities.api.Robot;

public interface RobotBuilder {
    RobotBuilder buildLeftHand(Hand leftHand);
    RobotBuilder buildRightHand(Hand rightHand);
    RobotBuilder buildLeftLeg(Leg leftLeg);
    RobotBuilder buildRightLeg(Leg rightLeg);
    Robot build();
}
