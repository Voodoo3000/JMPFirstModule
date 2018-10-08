package com.epam.jmp.powerOperations;

import com.epam.jmp.homeElectronics.HomeElectronicsList;
import com.epam.jmp.homeElectronics.HomeElectronics;

import java.util.Arrays;

public class SortByPower {

    public static void sortListOfElectronics(HomeElectronicsList homeElectronicsList, double minPower, double maxPower) {

        Arrays.sort(homeElectronicsList.getAs());

        System.out.println("Sort by high power:" );

        for (HomeElectronics i : homeElectronicsList.getAs())
            if (i.getPower() > minPower && i.getPower() < maxPower) {
                System.out.println(i + " - has suitable consumption power in set range between " + minPower + "W and " + maxPower + "W");
            } else System.out.println(i);
    }
}