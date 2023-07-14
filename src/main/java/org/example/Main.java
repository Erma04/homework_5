package org.example;


public class Main {
    public static void main(String[] args) {
        Boss myBoss = new Boss();
        myBoss.setBossHealth(500);
        myBoss.setBossDamage(50);
        myBoss.setBossTypeDefense("Physical");
        System.out.println("Boss Health: " + myBoss.getBossHealth() + " Boss Damage: " + myBoss.getBossDamage() + " Boss Defense: " + myBoss.getBossTypeDefense());
        // Дз на сообразительность
        Hero[] heroes = createHeroes();
        for (Hero myHero : heroes) {
            System.out.println("Hero Health: " + myHero.getHeroHealth() + " Hero Damage: " + myHero.getHeroDamage() + " Hero Superpower: " + myHero.getHeroSuperpower());

        }
    }


    public static Hero[] createHeroes(){
        Hero wizard = new Hero(120,90,"Magic");
        Hero giant = new Hero(250,130,"Strong Arms");
        Hero barbarian = new Hero(100,85,"Strong Hits");
        Hero[] heroesType={wizard,giant,barbarian};
        return heroesType;
    }
}