package com.epam.jmp.electronicsInstance;

import com.epam.jmp.homeElectronics.HomeElectronics;

public class Router extends HomeElectronics {

    private int linkSpeed = 1300;
    private String vlanFeature = "4 VLAN";

    @Override
    public String toString() {
        return "Router " +
                getModelName() + "; 802.11ac "
                + this.linkSpeed + "Mbit/s; " +
                "Features " + this.vlanFeature +
                "; consumption power: " + getPower() + "W, " +
                "powerOn: " + isOnOff() + super.toString();
    }
}
