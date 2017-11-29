/*
 * This factory class creates the instance of Heroes
 */
package org.thiagz.abstractfactory.hero;

import org.thiagz.abstractfactory.AbstractFactory;
import org.thiagz.abstractfactory.monster.Monster;

/**
 *
 * @author Thiagz
 */
public class HeroFactory extends AbstractFactory {

    @Override
    public Hero getHero(String type) {
        Hero heroInstance = null;

        if (type.equals("CowBoy")) {
            heroInstance = new CowBoyHero();
        } else if (type.equals("SciFi")) {
            heroInstance = new SciFiHero();
        }

        return heroInstance;
    }

    @Override
    public Monster getMonster(String type) {
        return null;
    }
}
