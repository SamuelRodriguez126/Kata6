package toyproducts.models;

import componentfactories.ComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;


public class AsianHelicopterToy implements Toy {

    private final Integer serialNumber;
    private final String type;
    private RotorBlade rotorBlade;
    private Engine engine;
    private final ComponentFactory componentFactory;
    
    public AsianHelicopterToy(Integer serialNumber, ComponentFactory componentFactory) {
        this.serialNumber = serialNumber;
        this.type = "Asian Helicopter";
        this.componentFactory = componentFactory;
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    public String getType() {
        return type;
    }
    
    @Override
    public void prepare() {
        this.rotorBlade = this.componentFactory.createRotorBlade();
        this.engine = this.componentFactory.createEngine();
        System.out.printf("Preparing '%s'\n", this.type);
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }
    
    @Override
    public void label(){
        System.out.printf("Labelling '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }

    @Override
    public String toString() {
        return "AsianHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
}
