package com.epam.jmp.powerOperations;

import com.epam.jmp.homeElectronics.HomeElectronicsList;
import com.epam.jmp.homeElectronics.HomeElectronics;

public class PowerCounter {

    public static void calculatePowerOnElectronics(HomeElectronicsList homeElectronicsList, double sum) {

        for (HomeElectronics i : homeElectronicsList.getAs()) {
            if (i.isOnOff()) {
                sum = sum + i.getPower();
            }
        }
        System.out.println("\nPower consumption summary of powerOn devices : " + sum + "W");
    }
}

