package factories;

import toyproducts.Toy;


public abstract class ToyFactory {
    
    protected SerialNumberGenerator serialNumberGenerator = SerialNumberGenerator.getInstance();
    
    public Toy produceToy(){
        Toy toy =  this.createToy(serialNumberGenerator.next());
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }
    
    protected abstract Toy createToy(Integer serialNumber);
}
