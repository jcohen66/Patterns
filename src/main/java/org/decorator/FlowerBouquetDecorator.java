package org.decorator;

/**
 * Force descendants to implement getDescription() to include both
 * the description of the decorator and the flower bouquet it is
 * decorating.
 */
public abstract class FlowerBouquetDecorator extends FlowerBouquet{
    public abstract String getDescription();
}
