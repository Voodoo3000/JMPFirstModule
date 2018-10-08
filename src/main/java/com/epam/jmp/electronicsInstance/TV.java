package com.epam.jmp.electronicsInstance;

import com.epam.jmp.homeElectronics.HomeElectronics;

public class TV extends HomeElectronics {

    private int diagonalSize = 75;
    private String displayResolution = "4K HDR";

    @Override
    public String toString() {
        return "TV " +
                getModelName() + "; Diag "
                + this.diagonalSize + "inch; " +
                "Resolution picture " + this.displayResolution +
                "; consumption power: " + getPower() + "W, " +
                "powerOn: " + isOnOff() + super.toString();
    }
}
