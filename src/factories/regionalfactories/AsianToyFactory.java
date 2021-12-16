package factories.regionalfactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;


public class AsianToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type){
        switch (type){
            case "car":
                return new AsianCarToy(super.generator.next());
            case "helicopter":
                return new AsianHelicopterToy(super.generator.next());
            default:
                return null;
        }
    }
}
