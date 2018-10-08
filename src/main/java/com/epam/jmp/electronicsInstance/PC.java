package com.epam.jmp.electronicsInstance;

import com.epam.jmp.homeElectronics.HomeElectronics;

public class PC extends HomeElectronics {

    private int cpuGhz = 4;
    private String gpu = "GTX1080 8Gb";

    @Override
    public String toString() {
        return "Desktop computer " +
                getModelName() + "; CPU "
                + this.cpuGhz + "Ghz; " +
                "GPU " + this.gpu +
                "; consumption power: " + getPower() + "W, " +
                "powerOn: " + isOnOff() + super.toString();
    }
}
