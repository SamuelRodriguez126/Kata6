package factories.regionalfactories;

import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanHelicopterToy;


public class AmericanHelicopterToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber){
        return new AmericanHelicopterToy(serialNumber, new AmericanComponentFactory());
    }
}
