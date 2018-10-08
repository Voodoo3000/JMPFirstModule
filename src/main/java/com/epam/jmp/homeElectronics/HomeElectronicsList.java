package com.epam.jmp.homeElectronics;

import com.epam.jmp.electronicsInstance.Fridge;
import com.epam.jmp.electronicsInstance.PC;
import com.epam.jmp.electronicsInstance.Router;
import com.epam.jmp.electronicsInstance.TV;

public class HomeElectronicsList {

    private HomeElectronics as [];

    public HomeElectronicsList(TV tv, Router router, Fridge fridge, PC pc) {

        this.as = new HomeElectronics[]{tv, router, fridge, pc};
    }
    public HomeElectronics[] getAs() {
        return as;
    }
}