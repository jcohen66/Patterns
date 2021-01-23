package org.decorator;

import org.junit.Test;

public class FlowerBouquetTest {
    @Test
    public void testFlowerBouquet() {
        /* Flower Bouquet with no decoration */
        FlowerBouquet roseBouquet = new RoseBouquet();
        System.out.println(roseBouquet.getDescription() + " $ " + roseBouquet.cost());

        /* Rose Bouquet with paper wrapper, ribbon bow, and glitter */
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBow(decoratedRoseBouquet);
        decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription() + " $ " + decoratedRoseBouquet.cost());

        /* Orchid bouquet with double paper wrapper and ribbon bow */
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new RibbonBow(decoratedOrchidBouquet);
        System.out.println(decoratedOrchidBouquet.getDescription() + " $ " + decoratedOrchidBouquet.cost());
    }
}
