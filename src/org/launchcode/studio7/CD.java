package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, int capacity, String type, String[] contents) {
        super(name, capacity, type, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("Spin at the rate of 1000 rpm");
    }

    @Override
    public void readData() {
        System.out.println("Contains classical music");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
