package com.epam.jmp.electronicsInstance;

import com.epam.jmp.homeElectronics.HomeElectronics;

public class Fridge extends HomeElectronics {

    private int capacity = 560;

    @Override
    public String toString() {
        return "Refridgerator " +
                getModelName() + "; Capacity "
                + this.capacity + " Litres;" +
                " consumption power: " + getPower() + "W, " +
                "powerOn: " + isOnOff() + super.toString();
    }
}
