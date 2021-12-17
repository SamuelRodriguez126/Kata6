package factories.regionalfactories;

import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;


public class AmericanCarToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber){
        return new AmericanCarToy(serialNumber, new AmericanComponentFactory());
    }
}
