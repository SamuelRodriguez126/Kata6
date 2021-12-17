package toyproducts.models;

import componentfactories.ComponentFactory;
import toyproducts.Toy;
import toyproducts.components.Engine;
import toyproducts.components.Wheel;


public class AsianCarToy implements Toy {

    private final Integer serialNumber;
    private final String type;
    private final Wheel wheels[] = new Wheel[4];
    private Engine engine;
    private final ComponentFactory componentFactory;
    
    public AsianCarToy(Integer serialNumber, ComponentFactory componentFactory) {
        this.serialNumber = serialNumber;
        this.type = "Asian Car";
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
        this.engine = this.componentFactory.createEngine();
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = this.componentFactory.createWheel();
            
        }
        System.out.printf("Preparing '%s'\n", this.getType());
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
        return "AsianCarToy{" + "serialNumber=" + serialNumber + '}';
    }
}
