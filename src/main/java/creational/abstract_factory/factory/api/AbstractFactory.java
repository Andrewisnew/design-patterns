package creational.abstract_factory.factory.api;

import creational.abstract_factory.entities.api.Gunner;
import creational.abstract_factory.entities.api.Warrior;

public interface AbstractFactory {
    Warrior createWarrior();
    Gunner createGunner();
}
