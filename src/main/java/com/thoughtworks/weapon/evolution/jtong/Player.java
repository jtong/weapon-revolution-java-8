package com.thoughtworks.weapon.evolution.jtong;

public class Player {
    private final String name;
    private int hp;
    private int ap;
    private Role role;
    private Weapon weapon;
    private int dp;

    public Player(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
        this.role = Role.NORMAL_PERSON;
    }

    public Player(String name, int hp, int ap, Role role, Weapon weapon) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
        this.role = role;
        this.weapon = weapon;
    }

    public AttackResult attack(Player target) {
        Injury injury = this.role.getInjuryCalculator().calculate(this, target, this.weapon);
        AttackResult attackResult = new AttackResult(injury, this, target);
        target.applyInjury(injury);
        return attackResult;
    }

    private void applyInjury(Injury injury) {
        this.hp -= injury.getAmount();
    }


    public Role getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAp() {
        return ap;
    }

    public int getDp() {
        return dp;
    }
}
