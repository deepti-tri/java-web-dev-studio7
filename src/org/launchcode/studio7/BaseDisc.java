package org.launchcode.studio7;

import java.util.ArrayList;

public class BaseDisc {
    private String name;
    private int capacity;
    private String type;
    private String[] contents;

    public BaseDisc(String name, int capacity, String type, String[] contents) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        this.contents = contents;
    }

    public String diskInfo() {
        String info = String.format("\nDisk Name: %s\nStorage: %d\nType: %s\n", name, capacity, type);
        return info;
    }
}
