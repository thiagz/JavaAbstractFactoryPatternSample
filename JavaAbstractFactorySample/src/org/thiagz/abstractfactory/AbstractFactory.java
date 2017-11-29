/*
 * The super class of Monster and Hero Factories
 */
package org.thiagz.abstractfactory;

import org.thiagz.abstractfactory.hero.Hero;
import org.thiagz.abstractfactory.monster.Monster;

/**
 *
 * @author Thiagz
 */
public abstract class AbstractFactory {
    public abstract Monster getMonster(String type);
    public abstract Hero getHero(String type);
}
