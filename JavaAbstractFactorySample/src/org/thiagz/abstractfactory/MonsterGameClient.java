/*
 * This is the client game application that will create multiple monsters 
 * and heroes using the AbstractFactory class
 * 
 */
package org.thiagz.abstractfactory;

import org.thiagz.abstractfactory.hero.Hero;
import org.thiagz.abstractfactory.monster.Monster;
/**
 *
 * @author Thiagz
 */
public class MonsterGameClient {
    
    public static void main(String args[]){
        AbstractFactory heroFactory = AbstractGameCharacterFactory.getFactory("Hero");
        Hero sciFiHero = heroFactory.getHero("SciFi");
        sciFiHero.combatTechnique();
        Hero cowBoyHero = heroFactory.getHero("CowBoy");
        cowBoyHero.combatTechnique();
        
        AbstractFactory monsterFactory = AbstractGameCharacterFactory.getFactory("Monster");
        Monster flyingMonster = monsterFactory.getMonster("Flying");
        flyingMonster.action();
        Monster crawlingMonster = monsterFactory.getMonster("Crawl");
        crawlingMonster.action();
    }
}
