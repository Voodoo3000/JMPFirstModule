package com.epam.jmp.launcher;

import com.epam.jmp.homeElectronics.HomeElectronicsList;
import com.epam.jmp.powerOperations.PowerCounter;
import com.epam.jmp.powerOperations.SortByPower;
import com.epam.jmp.electronicsInstance.Fridge;
import com.epam.jmp.electronicsInstance.PC;
import com.epam.jmp.electronicsInstance.Router;
import com.epam.jmp.electronicsInstance.TV;


public class Runner {

    public static void main(String[] args) {

        TV tv = new TV();
        tv.setModelName("Sony XE94");
        tv.setOnOff(true);
        tv.setPower(240);
        Router router = new Router();
        router.setModelName("HP R120");
        router.setOnOff(true);
        router.setPower(50);
        Fridge fridge = new Fridge();
        fridge.setModelName("Bosch KDD74AL20N");
        fridge.setOnOff(false);
        fridge.setPower(150);
        PC pc = new PC();
        pc.setModelName("ROG G20CB");
        pc.setOnOff(true);
        pc.setPower(500);

        HomeElectronicsList homeElectronicsList = new HomeElectronicsList(tv, router, fridge, pc);

        double minPower = 20;
        double maxPower = 200;

        SortByPower sortByPower = new SortByPower();
        sortByPower.sortListOfElectronics(homeElectronicsList,minPower,maxPower);

        double sum = 0;

        PowerCounter powerCounter = new PowerCounter();
        powerCounter.calculatePowerOnElectronics(homeElectronicsList,sum);

    }
}
