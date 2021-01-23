package org.decorator;

public class RibbonBow extends FlowerBouquetDecorator {
    FlowerBouquet flowerBouquet;

    public RibbonBow(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", ribbon bow";
    }

    @Override
    public double cost() {
        return 6.5 + flowerBouquet.cost();
    }
}
