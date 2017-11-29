/*
 * The Factory class which creates the instance of Hero and Monster Factories
 */
package org.thiagz.abstractfactory;

import org.thiagz.abstractfactory.hero.HeroFactory;
import org.thiagz.abstractfactory.monster.MonsterFactory;

/**
 *
 * @author Thiagz
 */
public class AbstractGameCharacterFactory {

    public static AbstractFactory getFactory(String character) {
        AbstractFactory abstractFactory = null;
        if (character.equals("Monster")) {
            abstractFactory = new MonsterFactory();
        } else if (character.equals("Hero")) {
            abstractFactory = new HeroFactory();
        }

        return abstractFactory;
    }
}
