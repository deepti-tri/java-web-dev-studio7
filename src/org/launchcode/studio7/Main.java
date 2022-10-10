package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        CD cd = new CD("Fur Elise and other classics", 512, "CD-ROM", new String[]{"Beethoven", "Mozart", "Chopin"});
        DVD dvd = new DVD("Cool Movies of 2022", 4096, "DVD-ROM", new String[] {"Frozen", "Shrek", "Die Hard"});

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.readData();
        dvd.readData();
        cd.spinDisc();
        dvd.spinDisc();
        System.out.println(cd.diskInfo());
        System.out.println(dvd.diskInfo());

    }
}
