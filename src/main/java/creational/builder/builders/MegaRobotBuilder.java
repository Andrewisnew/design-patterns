package creational.builder.builders;

import creational.builder.builders.api.RobotBuilder;
import creational.builder.entities.Body;
import creational.builder.entities.Hand;
import creational.builder.entities.Head;
import creational.builder.entities.Leg;
import creational.builder.entities.MegaRobot;

public class MegaRobotBuilder implements RobotBuilder {
    private Body body;
    private Head head;
    private Leg leftLeg;
    private Leg rigrtLeg;
    private Hand leftHand;
    private Hand rightHand;

    public MegaRobotBuilder(Body body, Head head) {
        this.body = body;
        this.head = head;
    }

    public RobotBuilder buildLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
        return this;
    }

    public RobotBuilder buildRightHand(Hand rightHand) {
        this.rightHand = rightHand;
        return this;
    }

    public RobotBuilder buildLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
        return this;
    }

    public RobotBuilder buildRightLeg(Leg rightLeg) {
        this.rigrtLeg = rightLeg;
        return this;
    }

    public MegaRobot build(){
        return new MegaRobot(body, head, leftLeg, rigrtLeg, leftHand, rightHand);
    }
}
