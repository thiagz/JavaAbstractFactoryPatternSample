/*
 * This factory class creates the instance of Monster
 */
package org.thiagz.abstractfactory.monster;

import org.thiagz.abstractfactory.AbstractFactory;
import org.thiagz.abstractfactory.hero.Hero;

/**
 *
 * @author Thiagz
 */
public class MonsterFactory extends AbstractFactory{
    
    @Override
    public Monster getMonster(String type){
        
        Monster monsterInstance = null;
        
        if(type.equals("Flying")){
            monsterInstance = new FlyingMonster();
        }else if(type.equals("Crawl")){
            monsterInstance = new CrawlingMonster();
        }
        
        return monsterInstance;
    }

    @Override
    public Hero getHero(String type) {
        return null;
    }
}
