
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;
import toyproducts.models.CarToy;
import toys.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness();
        ArrayList<Toy> toys = new ArrayList<Toy>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        //while(!(line = in.nextLine()).equals("exit")){
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch (line){
                case "car":    
                case "helicopter":    
                    toys.add(toyBusiness.createToy(line));
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
