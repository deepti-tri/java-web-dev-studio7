package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String name, int capacity, String type, String[] contents) {
        super(name, capacity, type, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("Spin at a rate of 2000 rpm");
    }

    @Override
    public void readData() {
        System.out.println("Contains new movies");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
