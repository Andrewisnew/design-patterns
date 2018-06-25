package creational.abstract_factory.factory;

import creational.abstract_factory.entities.Orc;
import creational.abstract_factory.entities.Troll;
import creational.abstract_factory.entities.api.Gunner;
import creational.abstract_factory.entities.api.Warrior;
import creational.abstract_factory.factory.api.AbstractFactory;

public class HordeFactory implements AbstractFactory {

    public Warrior createWarrior() {
        return new Orc();
    }

    public Gunner createGunner() {
        return new Troll();
    }
}
