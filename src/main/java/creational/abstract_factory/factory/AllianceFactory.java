package creational.abstract_factory.factory;

import creational.abstract_factory.entities.Elf;
import creational.abstract_factory.entities.Knight;
import creational.abstract_factory.entities.api.Gunner;
import creational.abstract_factory.entities.api.Warrior;
import creational.abstract_factory.factory.api.AbstractFactory;

public class AllianceFactory implements AbstractFactory {

    public Warrior createWarrior() {
        return new Knight();
    }

    public Gunner createGunner() {
        return new Elf();
    }
}
