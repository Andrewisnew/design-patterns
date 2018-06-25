package creational.builder.entities;

import creational.builder.entities.api.Robot;

public class MegaRobot implements Robot {
    private final Body body;
    private final Head head;
    private final Leg leftLeg;
    private final Leg rigrtLeg;
    private final Hand leftHand;
    private final Hand rightHand;

    public MegaRobot(Body body, Head head, Leg leftLeg, Leg rigrtLeg,
                     Hand leftHand, Hand rightHand) {
        this.body = body;
        this.head = head;
        this.leftLeg = leftLeg;
        this.rigrtLeg = rigrtLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    @Override
    public String toString() {
        return "MegaRobot{" +
            "body=" + body +
            ", head=" + head +
            ", leftLeg=" + leftLeg +
            ", rigrtLeg=" + rigrtLeg +
            ", leftHand=" + leftHand +
            ", rightHand=" + rightHand +
            '}';
    }
}
