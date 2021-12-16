package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;


public class AmericanToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type){
        switch (type){
            case "car":
                return new AmericanCarToy(super.generator.next());
            case "helicopter":
                return new AmericanHelicopterToy(super.generator.next());
            default:
                return null;
        }
    }
}
