
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AsianCarToyFactory;

public class Main {

    public static void main(String[] args) {
                
        ToyBusiness toyBusiness = new ToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
        
        toyBusiness.add("car", new AsianCarToyFactory());
        toyBusiness.add("helicopter", new AmericanHelicopterToyFactory());
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch (line){
                case "car":    
                case "helicopter":    
                    toys.add(toyBusiness.produceToy(line));
                    System.out.println("Built toys: " + toys
                            .stream()
                            .map(Object::toString)
                            .collect(Collectors.joining(", ")));
                    break;
                
                case "exit":
                    System.out.println("Exiting...");
                    break;
                
                default:
                    System.out.println("Command unknown!");
            }                                
        }
    }
}
