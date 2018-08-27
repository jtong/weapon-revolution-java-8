package com.thoughtworks.weapon.evolution.jtong;

import static com.thoughtworks.weapon.evolution.jtong.InjuryCalculator.NORMAL_PERSON_MADE_INJURY_CALCULATOR;
import static com.thoughtworks.weapon.evolution.jtong.InjuryCalculator.SOLIDER_MADE_INJURY_CALCULATOR;



public enum Role {
    NORMAL_PERSON("普通人", NORMAL_PERSON_MADE_INJURY_CALCULATOR), SOLIDER("战士", SOLIDER_MADE_INJURY_CALCULATOR);

    private String displayName;
    private InjuryCalculator normalPersonMadeInjuryCalculator;
    private InjuryCalculator injuryCalculator;

    Role(String displayName, InjuryCalculator injuryCalculator) {
        this.displayName = displayName;

        this.injuryCalculator = injuryCalculator;
    }


    @Override
    public String toString() {
        return this.displayName.toString();
    }


    public InjuryCalculator getInjuryCalculator() {
        return injuryCalculator;
    }
}
