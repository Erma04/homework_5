package org.example;

public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossTypeDefense;

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossTypeDefense() {
        return bossTypeDefense;
    }

    public void setBossTypeDefense(String bossTypeDefense) {
        this.bossTypeDefense = bossTypeDefense;
    }
}
