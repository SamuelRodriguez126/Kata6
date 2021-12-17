package factories.regionalfactories;

import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianHelicopterToy;


public class AsianHelicopterToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber){
        return new AsianHelicopterToy(serialNumber, new AmericanComponentFactory());
    }
}
