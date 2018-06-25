package creational.builder;

import creational.builder.builders.MegaRobotBuilder;
import creational.builder.builders.api.RobotBuilder;
import creational.builder.entities.Body;
import creational.builder.entities.Hand;
import creational.builder.entities.Head;
import creational.builder.entities.Leg;
import creational.builder.entities.MegaRobot;
import creational.builder.entities.api.Robot;
import org.junit.Test;

public class TestPattern {

    @Test
    public void builder() {
        RobotBuilder megaRobotBuilder =
            new MegaRobotBuilder(new Body(Material.SILVER), new Head(Material.GOLD));
        Robot megaRobot = megaRobotBuilder
            .buildLeftHand(new Hand(Material.STEEL))
            .buildRightHand(new Hand(Material.GOLD))
            .buildLeftLeg(new Leg(Material.GOLD))
            .buildRightLeg(new Leg(Material.SILVER))
            .build();
        RobotBuilder poorRobotBuilder =
            new MegaRobotBuilder(new Body(Material.STEEL), new Head(Material.STEEL));
        Robot poorRobo = poorRobotBuilder
            .buildLeftHand(new Hand(Material.WOOD))
            .buildRightHand(new Hand(Material.STEEL))
            .buildRightLeg(new Leg(Material.WOOD))
            .build();

        System.out.println(megaRobot);
        System.out.println(poorRobo);
    }
}
