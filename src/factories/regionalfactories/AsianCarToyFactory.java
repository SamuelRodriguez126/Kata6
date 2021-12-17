package factories.regionalfactories;

import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;


public class AsianCarToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber){
        return new AsianCarToy(serialNumber, new AmericanComponentFactory());
    }
}
