package toyproducts.models;

import toyproducts.Toy;


public class AsianHelicopterToy implements Toy {

    private final Integer serialNumber;
    private final String type;
    
    public AsianHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.type = "Asian Helicopter";
    }

    @Override
    public Integer getSerialNumber() {
        return serialNumber;
    }
    
    public String getType() {
        return type;
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
        return "AmericanHelicopterToy{" + "serialNumber=" + serialNumber + '}';
    }
}
