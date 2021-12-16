
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;
import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanSubmarineToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;

public class Main {

    public static void main(String[] args) {
                
        ToyBusiness toyBusiness = new ToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
        
        toyBusiness.add("car", new AmericanCarToyFactory());
        toyBusiness.add("helicopter", new AsianHelicopterToyFactory());
        toyBusiness.add("submarine", new AmericanSubmarineToyFactory());
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        //while(!(line = in.nextLine()).equals("exit")){
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch (line){
                case "car":    
                case "helicopter":    
                case "submarine":
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
