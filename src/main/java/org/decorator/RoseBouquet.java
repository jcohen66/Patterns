package org.decorator;

import com.sun.tools.javac.comp.Flow;

public class RoseBouquet extends FlowerBouquet {
    public RoseBouquet() {
        description = "Rose Bouquet";
    }

    @Override
    public double cost() {
        return 12.0;
    }
}
